package org.apache.commons.logging.impl;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class WeakHashtable extends Hashtable {
    private static final int MAX_CHANGES_BEFORE_PURGE = 100;
    private static final int PARTIAL_PURGE_COUNT = 10;
    private static final long serialVersionUID = -1546036869799732453L;
    private final ReferenceQueue queue = new ReferenceQueue();
    private int changeCount = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        public final Object f77676a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f77677b;

        public /* synthetic */ a(Object obj, Object obj2, h hVar) {
            this(obj, obj2);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof Map.Entry)) {
                Map.Entry entry = (Map.Entry) obj;
                if (getKey() != null ? getKey().equals(entry.getKey()) : entry.getKey() == null) {
                    if (getValue() == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (getValue().equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f77676a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f77677b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Entry.setValue is not supported.");
        }

        public a(Object obj, Object obj2) {
            this.f77676a = obj;
            this.f77677b = obj2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f77678a;

        /* renamed from: b, reason: collision with root package name */
        public final int f77679b;

        public /* synthetic */ b(Object obj, ReferenceQueue referenceQueue, h hVar) {
            this(obj, referenceQueue);
        }

        public final Object b() {
            return this.f77678a.get();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            Object b11 = b();
            Object b12 = bVar.b();
            return b11 == null ? b12 == null && hashCode() == bVar.hashCode() : b11.equals(b12);
        }

        public int hashCode() {
            return this.f77679b;
        }

        public /* synthetic */ b(Object obj, h hVar) {
            this(obj);
        }

        public b(Object obj) {
            this.f77678a = new WeakReference(obj);
            this.f77679b = obj.hashCode();
        }

        public b(Object obj, ReferenceQueue referenceQueue) {
            this.f77678a = new c(obj, referenceQueue, this, null);
            this.f77679b = obj.hashCode();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        public final b f77680a;

        public /* synthetic */ c(Object obj, ReferenceQueue referenceQueue, b bVar, h hVar) {
            this(obj, referenceQueue, bVar);
        }

        public final b b() {
            return this.f77680a;
        }

        public c(Object obj, ReferenceQueue referenceQueue, b bVar) {
            super(obj, referenceQueue);
            this.f77680a = bVar;
        }
    }

    private void purge() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.queue) {
            while (true) {
                try {
                    c cVar = (c) this.queue.poll();
                    if (cVar == null) {
                        break;
                    } else {
                        arrayList.add(cVar.b());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            super.remove(arrayList.get(i11));
        }
    }

    private void purgeOne() {
        synchronized (this.queue) {
            try {
                c cVar = (c) this.queue.poll();
                if (cVar != null) {
                    super.remove(cVar.b());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.Hashtable, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(new b(obj, (h) null));
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public Enumeration elements() {
        purge();
        return super.elements();
    }

    @Override // java.util.Hashtable, java.util.Map
    public Set entrySet() {
        purge();
        Set<Map.Entry> entrySet = super.entrySet();
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : entrySet) {
            Object b11 = ((b) entry.getKey()).b();
            Object value = entry.getValue();
            if (b11 != null) {
                hashSet.add(new a(b11, value, null));
            }
        }
        return hashSet;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public Object get(Object obj) {
        return super.get(new b(obj, (h) null));
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public boolean isEmpty() {
        purge();
        return super.isEmpty();
    }

    @Override // java.util.Hashtable, java.util.Map
    public Set keySet() {
        purge();
        Set keySet = super.keySet();
        HashSet hashSet = new HashSet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            Object b11 = ((b) it.next()).b();
            if (b11 != null) {
                hashSet.add(b11);
            }
        }
        return hashSet;
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public Enumeration keys() {
        purge();
        return new h(this, super.keys());
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized Object put(Object obj, Object obj2) {
        try {
            if (obj == null) {
                throw new NullPointerException("Null keys are not allowed");
            }
            if (obj2 == null) {
                throw new NullPointerException("Null values are not allowed");
            }
            int i11 = this.changeCount;
            int i12 = i11 + 1;
            this.changeCount = i12;
            if (i11 > 100) {
                purge();
                this.changeCount = 0;
            } else if (i12 % 10 == 0) {
                purgeOne();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return super.put(new b(obj, this.queue, null), obj2);
    }

    @Override // java.util.Hashtable, java.util.Map
    public void putAll(Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // java.util.Hashtable
    public void rehash() {
        purge();
        super.rehash();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized Object remove(Object obj) {
        try {
            int i11 = this.changeCount;
            int i12 = i11 + 1;
            this.changeCount = i12;
            if (i11 > 100) {
                purge();
                this.changeCount = 0;
            } else if (i12 % 10 == 0) {
                purgeOne();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return super.remove(new b(obj, (h) null));
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public int size() {
        purge();
        return super.size();
    }

    @Override // java.util.Hashtable
    public String toString() {
        purge();
        return super.toString();
    }

    @Override // java.util.Hashtable, java.util.Map
    public Collection values() {
        purge();
        return super.values();
    }
}
