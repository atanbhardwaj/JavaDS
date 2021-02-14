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
        int index = hash(key);
        LinkedList<Entry> bucket = entries[index];
        if(bucket!=null){
            for(Entry entry: bucket) {
                if (entry.key == key)
                    return entry.value;
            }
        }
        return null;
    }

    public void remove(int key){
        int index = hash(key);
        LinkedList<Entry> bucket = entries[index];
        if(bucket==null)
            throw new IllegalStateException();
        for(Entry entry: bucket){
            if(entry.key == key){
                bucket.remove(entry);
                return;
            }
        }
        throw new IllegalStateException();
    }


    private int hash(int key){
        key = Math.abs(key);
        return key % entries.length;
    }


}
