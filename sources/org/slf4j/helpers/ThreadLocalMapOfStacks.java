package org.slf4j.helpers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ThreadLocalMapOfStacks {
    final ThreadLocal<Map<String, Deque<String>>> tlMapOfStacks = new ThreadLocal<>();

    public void clearDequeByKey(String str) {
        Map<String, Deque<String>> map;
        Deque<String> deque;
        if (str == null || (map = this.tlMapOfStacks.get()) == null || (deque = map.get(str)) == null) {
            return;
        }
        deque.clear();
    }

    public Deque<String> getCopyOfDequeByKey(String str) {
        Map<String, Deque<String>> map;
        Deque<String> deque;
        if (str == null || (map = this.tlMapOfStacks.get()) == null || (deque = map.get(str)) == null) {
            return null;
        }
        return new ArrayDeque(deque);
    }

    public String popByKey(String str) {
        Map<String, Deque<String>> map;
        Deque<String> deque;
        if (str == null || (map = this.tlMapOfStacks.get()) == null || (deque = map.get(str)) == null) {
            return null;
        }
        return deque.pop();
    }

    public void pushByKey(String str, String str2) {
        if (str == null) {
            return;
        }
        Map<String, Deque<String>> map = this.tlMapOfStacks.get();
        if (map == null) {
            map = new HashMap<>();
            this.tlMapOfStacks.set(map);
        }
        Deque<String> deque = map.get(str);
        if (deque == null) {
            deque = new ArrayDeque<>();
        }
        deque.push(str2);
        map.put(str, deque);
    }
}
