package com.nonlineardatastructures;

import java.util.HashMap;

public class Trie {
    public static int ALPHABET_SIZE = 26;
    private class TrieNode{
        private char value;
        private HashMap<Character, TrieNode> children = new HashMap<>();
        private boolean isEndOfWord;

        public TrieNode(char value){
            this.value = value;
        }

        @Override
        public String toString() {
            return "Value =" + value;
        }

        public boolean hasChild(char ch){
            return children.containsKey(ch);
        }

        public void addChild(char ch){
            children.put(ch, new TrieNode(ch));
        }

        public TrieNode getChild(char ch){
            return children.get(ch);
        }

        public TrieNode[] getChildren()
        {
            return children.values().toArray(new TrieNode[0]);
        }
    }

    private TrieNode root = new TrieNode(' ');

    public void insert(String word){
        TrieNode current = root;
        for(char ch: word.toCharArray()){
            int index = ch - 'a';
            if(!current.hasChild(ch))
                current.addChild(ch);
            current = current.getChild(ch);
        }
        current.isEndOfWord = true;
    }

    public boolean contains(String word){
        if(word==null)
            return false;

        TrieNode current = root;
        for(char ch: word.toCharArray()){
            int index = ch - 'a';
            if(!current.hasChild(ch))
                return false;
            current = current.getChild(ch);
        }

        return current.isEndOfWord;
    }

    public void traverse()
    {
        traverse(root);
    }
    private void traverse(TrieNode root)
    {
        System.out.println(root.value);
        for(TrieNode child: root.getChildren())
            traverse(child);
    }

}
