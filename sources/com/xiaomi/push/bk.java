package com.xiaomi.push;

import java.util.LinkedList;

/* loaded from: classes8.dex */
public class bk {

    /* renamed from: a, reason: collision with root package name */
    private LinkedList<a> f45312a = new LinkedList<>();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final bk f45313a = new bk();

        /* renamed from: a, reason: collision with other field name */
        public int f175a;

        /* renamed from: a, reason: collision with other field name */
        public Object f176a;

        /* renamed from: a, reason: collision with other field name */
        public String f177a;

        public a(int i11, Object obj) {
            this.f175a = i11;
            this.f176a = obj;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized int m5753a() {
        return this.f45312a.size();
    }

    public static bk a() {
        return a.f45313a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized LinkedList<a> m5754a() {
        LinkedList<a> linkedList;
        linkedList = this.f45312a;
        this.f45312a = new LinkedList<>();
        return linkedList;
    }

    /* renamed from: a, reason: collision with other method in class */
    private void m5752a() {
        if (this.f45312a.size() > 100) {
            this.f45312a.removeFirst();
        }
    }

    public synchronized void a(Object obj) {
        this.f45312a.add(new a(0, obj));
        m5752a();
    }
}
