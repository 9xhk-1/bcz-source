package i80;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class c {

    /* renamed from: s, reason: collision with root package name */
    public static String f60259s = "EventBus";

    /* renamed from: t, reason: collision with root package name */
    public static volatile c f60260t;

    /* renamed from: u, reason: collision with root package name */
    public static final i80.d f60261u = new i80.d();

    /* renamed from: v, reason: collision with root package name */
    public static final Map<Class<?>, List<Class<?>>> f60262v = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, CopyOnWriteArrayList<p>> f60263a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<Object, List<Class<?>>> f60264b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, Object> f60265c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal<d> f60266d;

    /* renamed from: e, reason: collision with root package name */
    public final g f60267e;

    /* renamed from: f, reason: collision with root package name */
    public final k f60268f;

    /* renamed from: g, reason: collision with root package name */
    public final i80.b f60269g;

    /* renamed from: h, reason: collision with root package name */
    public final i80.a f60270h;

    /* renamed from: i, reason: collision with root package name */
    public final o f60271i;

    /* renamed from: j, reason: collision with root package name */
    public final ExecutorService f60272j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f60273k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f60274l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f60275m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f60276n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f60277o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f60278p;

    /* renamed from: q, reason: collision with root package name */
    public final int f60279q;

    /* renamed from: r, reason: collision with root package name */
    public final f f60280r;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ThreadLocal<d> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d initialValue() {
            return new d();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60282a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f60282a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60282a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60282a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60282a[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60282a[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: i80.c$c, reason: collision with other inner class name */
    public interface InterfaceC0696c {
        void a(List<m> list);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final List<Object> f60283a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public boolean f60284b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f60285c;

        /* renamed from: d, reason: collision with root package name */
        public p f60286d;

        /* renamed from: e, reason: collision with root package name */
        public Object f60287e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f60288f;
    }

    public c() {
        this(f60261u);
    }

    public static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public static i80.d b() {
        return new i80.d();
    }

    public static void e() {
        o.a();
        f60262v.clear();
    }

    public static c f() {
        if (f60260t == null) {
            synchronized (c.class) {
                try {
                    if (f60260t == null) {
                        f60260t = new c();
                    }
                } finally {
                }
            }
        }
        return f60260t;
    }

    public static List<Class<?>> p(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f60262v;
        synchronized (map) {
            try {
                list = map.get(cls);
                if (list == null) {
                    list = new ArrayList<>();
                    for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                        list.add(cls2);
                        a(list, cls2.getInterfaces());
                    }
                    f60262v.put(cls, list);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    public synchronized void A(Object obj) {
        try {
            List<Class<?>> list = this.f60264b.get(obj);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    B(obj, it.next());
                }
                this.f60264b.remove(obj);
            } else {
                this.f60280r.a(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void B(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<p> copyOnWriteArrayList = this.f60263a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i11 = 0;
            while (i11 < size) {
                p pVar = copyOnWriteArrayList.get(i11);
                if (pVar.f60346a == obj) {
                    pVar.f60348c = false;
                    copyOnWriteArrayList.remove(i11);
                    i11--;
                    size--;
                }
                i11++;
            }
        }
    }

    public void c(Object obj) {
        d dVar = this.f60266d.get();
        if (!dVar.f60284b) {
            throw new EventBusException("This method may only be called from inside event handling methods on the posting thread");
        }
        if (obj == null) {
            throw new EventBusException("Event may not be null");
        }
        if (dVar.f60287e != obj) {
            throw new EventBusException("Only the currently handled event may be aborted");
        }
        if (dVar.f60286d.f60347b.f60324b != ThreadMode.POSTING) {
            throw new EventBusException(" event handlers may only abort the incoming event");
        }
        dVar.f60288f = true;
    }

    public final void d(p pVar, Object obj) {
        if (obj != null) {
            u(pVar, obj, n());
        }
    }

    public ExecutorService g() {
        return this.f60272j;
    }

    public f h() {
        return this.f60280r;
    }

    public <T> T i(Class<T> cls) {
        T cast;
        synchronized (this.f60265c) {
            cast = cls.cast(this.f60265c.get(cls));
        }
        return cast;
    }

    public final void j(p pVar, Object obj, Throwable th2) {
        if (!(obj instanceof m)) {
            if (this.f60273k) {
                throw new EventBusException("Invoking subscriber failed", th2);
            }
            if (this.f60274l) {
                this.f60280r.b(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + pVar.f60346a.getClass(), th2);
            }
            if (this.f60276n) {
                q(new m(this, th2, obj, pVar.f60346a));
                return;
            }
            return;
        }
        if (this.f60274l) {
            f fVar = this.f60280r;
            Level level = Level.SEVERE;
            fVar.b(level, "SubscriberExceptionEvent subscriber " + pVar.f60346a.getClass() + " threw an exception", th2);
            m mVar = (m) obj;
            this.f60280r.b(level, "Initial event " + mVar.f60321c + " caused exception in " + mVar.f60322d, mVar.f60320b);
        }
    }

    public boolean k(Class<?> cls) {
        CopyOnWriteArrayList<p> copyOnWriteArrayList;
        List<Class<?>> p11 = p(cls);
        if (p11 != null) {
            int size = p11.size();
            for (int i11 = 0; i11 < size; i11++) {
                Class<?> cls2 = p11.get(i11);
                synchronized (this) {
                    copyOnWriteArrayList = this.f60263a.get(cls2);
                }
                if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void l(i iVar) {
        Object obj = iVar.f60314a;
        p pVar = iVar.f60315b;
        i.b(iVar);
        if (pVar.f60348c) {
            m(pVar, obj);
        }
    }

    public void m(p pVar, Object obj) {
        try {
            pVar.f60347b.f60323a.invoke(pVar.f60346a, obj);
        } catch (IllegalAccessException e11) {
            throw new IllegalStateException("Unexpected exception", e11);
        } catch (InvocationTargetException e12) {
            j(pVar, obj, e12.getCause());
        }
    }

    public final boolean n() {
        g gVar = this.f60267e;
        if (gVar != null) {
            return gVar.a();
        }
        return true;
    }

    public synchronized boolean o(Object obj) {
        return this.f60264b.containsKey(obj);
    }

    public void q(Object obj) {
        d dVar = this.f60266d.get();
        List<Object> list = dVar.f60283a;
        list.add(obj);
        if (dVar.f60284b) {
            return;
        }
        dVar.f60285c = n();
        dVar.f60284b = true;
        if (dVar.f60288f) {
            throw new EventBusException("Internal error. Abort state was not reset");
        }
        while (true) {
            try {
                if (list.isEmpty()) {
                    return;
                } else {
                    r(list.remove(0), dVar);
                }
            } finally {
                dVar.f60284b = false;
                dVar.f60285c = false;
            }
        }
    }

    public final void r(Object obj, d dVar) throws Error {
        boolean s11;
        Class<?> cls = obj.getClass();
        if (this.f60278p) {
            List<Class<?>> p11 = p(cls);
            int size = p11.size();
            s11 = false;
            for (int i11 = 0; i11 < size; i11++) {
                s11 |= s(obj, dVar, p11.get(i11));
            }
        } else {
            s11 = s(obj, dVar, cls);
        }
        if (s11) {
            return;
        }
        if (this.f60275m) {
            this.f60280r.a(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.f60277o || cls == h.class || cls == m.class) {
            return;
        }
        q(new h(this, obj));
    }

    public final boolean s(Object obj, d dVar, Class<?> cls) {
        CopyOnWriteArrayList<p> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f60263a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<p> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            p next = it.next();
            dVar.f60287e = obj;
            dVar.f60286d = next;
            try {
                u(next, obj, dVar.f60285c);
                if (dVar.f60288f) {
                    return true;
                }
            } finally {
                dVar.f60287e = null;
                dVar.f60286d = null;
                dVar.f60288f = false;
            }
        }
        return true;
    }

    public void t(Object obj) {
        synchronized (this.f60265c) {
            this.f60265c.put(obj.getClass(), obj);
        }
        q(obj);
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f60279q + ", eventInheritance=" + this.f60278p + "]";
    }

    public final void u(p pVar, Object obj, boolean z11) {
        int i11 = b.f60282a[pVar.f60347b.f60324b.ordinal()];
        if (i11 == 1) {
            m(pVar, obj);
            return;
        }
        if (i11 == 2) {
            if (z11) {
                m(pVar, obj);
                return;
            } else {
                this.f60268f.a(pVar, obj);
                return;
            }
        }
        if (i11 == 3) {
            k kVar = this.f60268f;
            if (kVar != null) {
                kVar.a(pVar, obj);
                return;
            } else {
                m(pVar, obj);
                return;
            }
        }
        if (i11 == 4) {
            if (z11) {
                this.f60269g.a(pVar, obj);
                return;
            } else {
                m(pVar, obj);
                return;
            }
        }
        if (i11 == 5) {
            this.f60270h.a(pVar, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + pVar.f60347b.f60324b);
    }

    public void v(Object obj) {
        List<n> b11 = this.f60271i.b(obj.getClass());
        synchronized (this) {
            try {
                Iterator<n> it = b11.iterator();
                while (it.hasNext()) {
                    z(obj, it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void w() {
        synchronized (this.f60265c) {
            this.f60265c.clear();
        }
    }

    public <T> T x(Class<T> cls) {
        T cast;
        synchronized (this.f60265c) {
            cast = cls.cast(this.f60265c.remove(cls));
        }
        return cast;
    }

    public boolean y(Object obj) {
        synchronized (this.f60265c) {
            try {
                Class<?> cls = obj.getClass();
                if (!obj.equals(this.f60265c.get(cls))) {
                    return false;
                }
                this.f60265c.remove(cls);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z(Object obj, n nVar) {
        Class<?> cls = nVar.f60325c;
        p pVar = new p(obj, nVar);
        CopyOnWriteArrayList<p> copyOnWriteArrayList = this.f60263a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f60263a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(pVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i11 = 0; i11 <= size; i11++) {
            if (i11 == size || nVar.f60326d > copyOnWriteArrayList.get(i11).f60347b.f60326d) {
                copyOnWriteArrayList.add(i11, pVar);
                break;
            }
        }
        List<Class<?>> list = this.f60264b.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.f60264b.put(obj, list);
        }
        list.add(cls);
        if (nVar.f60327e) {
            if (!this.f60278p) {
                d(pVar, this.f60265c.get(cls));
                return;
            }
            for (Map.Entry<Class<?>, Object> entry : this.f60265c.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    d(pVar, entry.getValue());
                }
            }
        }
    }

    public c(i80.d dVar) {
        this.f60266d = new a();
        this.f60280r = dVar.f();
        this.f60263a = new HashMap();
        this.f60264b = new HashMap();
        this.f60265c = new ConcurrentHashMap();
        g g11 = dVar.g();
        this.f60267e = g11;
        this.f60268f = g11 != null ? g11.b(this) : null;
        this.f60269g = new i80.b(this);
        this.f60270h = new i80.a(this);
        List<j80.d> list = dVar.f60300k;
        this.f60279q = list != null ? list.size() : 0;
        this.f60271i = new o(dVar.f60300k, dVar.f60297h, dVar.f60296g);
        this.f60274l = dVar.f60290a;
        this.f60275m = dVar.f60291b;
        this.f60276n = dVar.f60292c;
        this.f60277o = dVar.f60293d;
        this.f60273k = dVar.f60294e;
        this.f60278p = dVar.f60295f;
        this.f60272j = dVar.f60298i;
    }
}
