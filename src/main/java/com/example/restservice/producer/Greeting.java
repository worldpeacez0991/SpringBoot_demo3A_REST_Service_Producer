package com.example.restservice.producer;

// With Java 14, the usage of the keyword 'record' will auto generate the usual boilerplate of a model class. (like constructor, getter and setter and equals method)
// https://www.baeldung.com/java-record-keyword 
public record Greeting(long id, String content) { }
