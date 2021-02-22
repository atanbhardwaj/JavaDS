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

        public boolean hasChildren(){
            return !children.isEmpty();
        }

        public void removeChild(char ch){
            children.remove(ch);
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

    public void traversePost()
    {
        traversePost(root);
    }
    public void traversePre()
    {
        traversePre(root);
    }
    private void traversePost(TrieNode root)
    {
        for(TrieNode child: root.getChildren())
            traversePost(child);
        System.out.println(root.value);
    }
    private void traversePre(TrieNode root)
    {
        System.out.println(root.value);
        for(TrieNode child: root.getChildren())
            traversePre(child);
    }

    public void remove(String word){
        if(word==null)
            return;
        remove(root, word,0);
    }

    private void remove(TrieNode root, String word, int index){
        if(index == word.length()){
//            System.out.println(root.value);
            root.isEndOfWord = false;
            return;
        }

        char ch = word.charAt(index);
        TrieNode child = root.getChild(ch);
        if(child==null)
            return;
        remove(child, word, index+1);
//        System.out.println(root.value);
        if(!child.hasChildren() && !child.isEndOfWord)
            root.removeChild(ch);

    }
}
