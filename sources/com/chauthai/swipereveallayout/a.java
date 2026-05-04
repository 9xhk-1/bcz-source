package com.chauthai.swipereveallayout;

import android.os.Bundle;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    public static final String f29026i = "ViewBinderHelper_Bundle_Map_Key";

    /* renamed from: a, reason: collision with root package name */
    public Map<String, Integer> f29027a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b, reason: collision with root package name */
    public Map<String, SwipeRevealLayout> f29028b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c, reason: collision with root package name */
    public Set<String> f29029c = Collections.synchronizedSet(new HashSet());

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f29030d = false;

    /* renamed from: e, reason: collision with root package name */
    public final Object f29031e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f29032f = false;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f29033g = false;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f29034h = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.chauthai.swipereveallayout.a$a, reason: collision with other inner class name */
    public class C0341a implements SwipeRevealLayout.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f29035a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SwipeRevealLayout f29036b;

        public C0341a(final String val$id, final SwipeRevealLayout val$swipeLayout) {
            this.f29035a = val$id;
            this.f29036b = val$swipeLayout;
        }

        @Override // com.chauthai.swipereveallayout.SwipeRevealLayout.c
        public void a(int state) {
            a.this.f29027a.put(this.f29035a, Integer.valueOf(state));
            if (a.this.f29030d) {
                a.this.f(this.f29035a, this.f29036b);
            }
        }
    }

    public void d(final SwipeRevealLayout swipeLayout, final String id2) {
        if (swipeLayout.K()) {
            swipeLayout.requestLayout();
        }
        this.f29028b.values().remove(swipeLayout);
        this.f29028b.put(id2, swipeLayout);
        swipeLayout.z();
        swipeLayout.setDragStateChangeListener(new C0341a(id2, swipeLayout));
        boolean z11 = true;
        if (this.f29027a.containsKey(id2)) {
            int intValue = this.f29027a.get(id2).intValue();
            if (this.f29033g) {
                this.f29027a.put(id2, 2);
                swipeLayout.I(false);
            } else if (intValue == 0 || intValue == 1 || intValue == 4) {
                swipeLayout.A(false);
            } else {
                swipeLayout.I(false);
            }
        } else if (this.f29033g) {
            this.f29027a.put(id2, 2);
            swipeLayout.I(false);
        } else {
            this.f29027a.put(id2, 0);
            swipeLayout.A(false);
        }
        if (!this.f29029c.contains(id2) && !this.f29034h) {
            z11 = false;
        }
        swipeLayout.setLockDrag(z11);
    }

    public void e(final String id2) {
        synchronized (this.f29031e) {
            try {
                this.f29027a.put(id2, 0);
                if (this.f29028b.containsKey(id2)) {
                    this.f29028b.get(id2).A(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(String id2, SwipeRevealLayout swipeLayout) {
        synchronized (this.f29031e) {
            try {
                if (g() > 1) {
                    for (Map.Entry<String, Integer> entry : this.f29027a.entrySet()) {
                        if (!entry.getKey().equals(id2)) {
                            entry.setValue(0);
                        }
                    }
                    for (SwipeRevealLayout swipeRevealLayout : this.f29028b.values()) {
                        if (swipeRevealLayout != swipeLayout) {
                            swipeRevealLayout.A(true);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int g() {
        Iterator<Integer> it = this.f29027a.values().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (intValue == 2 || intValue == 3) {
                i11++;
            }
        }
        return i11;
    }

    public void h(String... id2) {
        m(true, id2);
    }

    public void i(final String id2) {
        synchronized (this.f29031e) {
            try {
                this.f29027a.put(id2, 2);
                if (this.f29028b.containsKey(id2)) {
                    this.f29028b.get(id2).I(true);
                } else if (this.f29030d) {
                    f(id2, this.f29028b.get(id2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(Bundle inState) {
        if (inState != null && inState.containsKey(f29026i)) {
            HashMap hashMap = new HashMap();
            Bundle bundle = inState.getBundle(f29026i);
            Set<String> keySet = bundle.keySet();
            if (keySet != null) {
                for (String str : keySet) {
                    hashMap.put(str, Integer.valueOf(bundle.getInt(str)));
                }
            }
            this.f29027a = hashMap;
        }
    }

    public void k(Bundle outState) {
        if (outState == null) {
            return;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Integer> entry : this.f29027a.entrySet()) {
            bundle.putInt(entry.getKey(), entry.getValue().intValue());
        }
        outState.putBundle(f29026i, bundle);
    }

    public void l(boolean lock) {
        this.f29034h = lock;
        Iterator<SwipeRevealLayout> it = this.f29028b.values().iterator();
        while (it.hasNext()) {
            it.next().setLockDrag(this.f29034h);
        }
    }

    public final void m(boolean lock, String... id2) {
        if (id2 == null || id2.length == 0) {
            return;
        }
        if (lock) {
            this.f29029c.addAll(Arrays.asList(id2));
        } else {
            this.f29029c.removeAll(Arrays.asList(id2));
        }
        for (String str : id2) {
            SwipeRevealLayout swipeRevealLayout = this.f29028b.get(str);
            if (swipeRevealLayout != null) {
                swipeRevealLayout.setLockDrag(lock);
            }
        }
    }

    public void n(boolean open) {
        this.f29033g = open;
        if (open) {
            this.f29030d = false;
            Iterator<String> it = this.f29028b.keySet().iterator();
            while (it.hasNext()) {
                i(it.next());
            }
            return;
        }
        Iterator<String> it2 = this.f29028b.keySet().iterator();
        while (it2.hasNext()) {
            e(it2.next());
        }
        this.f29030d = this.f29032f;
    }

    public void o(boolean openOnlyOne) {
        this.f29030d = openOnlyOne;
        this.f29032f = openOnlyOne;
    }

    public void p(String... id2) {
        m(false, id2);
    }
}
