package com.lineardatastructures;

import java.util.LinkedList;

public class HashTable {

    private class Entry{
        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

        private String value;
        private int key;
    }

    private final LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value){
        int index = hash(key);
        if(entries[index] == null)
            entries[index] = new LinkedList<Entry>();
        LinkedList<Entry> bucket = entries[index];
        for(Entry entry: bucket){
            if(entry.key == key)
                entry.value = value;
        }
        bucket.addLast(new Entry(key, value));
    }

    public String get(int key){
        Entry entry = getEntry(key);
        return (entry == null) ? null : entry.value;
    }

    public void remove(int key){
        Entry entry = getEntry(key);
        if(entry == null)
            throw new IllegalStateException();
        getBucket(key).remove(key);
    }

    private LinkedList<Entry> getBucket(int key){
        return entries[hash(key)];
    }

    private Entry getEntry(int key){
        LinkedList<Entry> bucket = getBucket(key);
        if(bucket != null){
            for(Entry entry: bucket){
                if(entry.key == key)
                    return entry;
            }
        }
        return null;
    }

    private int hash(int key){
        key = Math.abs(key);
        return key % entries.length;
    }

}
