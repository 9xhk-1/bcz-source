package be;

import a00.k1;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import be.s;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Triple;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public class s implements h {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f6784f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f6785g = 8;

    /* renamed from: h, reason: collision with root package name */
    public static final String f6786h = s.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ViewGroup f6787a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Map<Class<?>, k> f6788b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6789c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6790d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public x00.a<g2> f6791e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements LifecycleEventObserver {
        public a() {
        }

        public static final g2 b(s sVar) {
            x00.a aVar = sVar.f6791e;
            if (aVar != null) {
                aVar.invoke();
            }
            return g2.f100423a;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
            g0.p(source, "source");
            g0.p(event, "event");
            qb.c.b(s.f6786h, "onStateChanged: " + event.getTargetState(), new Object[0]);
            s.this.f6789c = event.getTargetState().isAtLeast(Lifecycle.State.RESUMED);
            if (s.this.f6790d) {
                s.this.f6790d = false;
                final s sVar = s.this;
                h.d(sVar, false, new x00.a() { // from class: be.r
                    @Override // x00.a
                    public final Object invoke() {
                        g2 b11;
                        b11 = s.a.b(s.this);
                        return b11;
                    }
                }, 1, null);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    public s(@m80.k ViewGroup container, @m80.k Lifecycle lifecycle) {
        g0.p(container, "container");
        g0.p(lifecycle, "lifecycle");
        this.f6787a = container;
        this.f6788b = new LinkedHashMap();
        this.f6789c = true;
        lifecycle.addObserver(new a());
    }

    public static final g2 p(ViewGroup viewGroup, View view, x00.a aVar) {
        viewGroup.removeView(view);
        aVar.invoke();
        return g2.f100423a;
    }

    public static final boolean q(View view, MotionEvent motionEvent) {
        return true;
    }

    public static final int r(s sVar, Class cls, Class cls2) {
        k kVar = sVar.f6788b.get(cls);
        int weight = kVar != null ? kVar.getWeight() : 0;
        k kVar2 = sVar.f6788b.get(cls2);
        return weight - (kVar2 != null ? kVar2.getWeight() : 0);
    }

    public static final int s(x00.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    @Override // be.h
    public boolean c(boolean z11, @m80.k x00.a<g2> onDismiss) {
        g0.p(onDismiss, "onDismiss");
        if (!this.f6789c) {
            qb.c.b(f6786h, "not achievable for now!", new Object[0]);
            this.f6790d = z11;
            this.f6791e = onDismiss;
            return false;
        }
        qb.c.b(f6786h, "current guiders count: " + this.f6788b.size(), new Object[0]);
        Map<Class<?>, k> map = this.f6788b;
        final x00.p pVar = new x00.p() { // from class: be.p
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                int r11;
                r11 = s.r(s.this, (Class) obj, (Class) obj2);
                return Integer.valueOf(r11);
            }
        };
        Iterator it = k1.r(map, new Comparator() { // from class: be.q
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int s11;
                s11 = s.s(x00.p.this, obj, obj2);
                return s11;
            }
        }).entrySet().iterator();
        while (it.hasNext()) {
            k kVar = (k) ((Map.Entry) it.next()).getValue();
            qb.c.b(f6786h, "cur " + kVar, new Object[0]);
            g0.m(kVar);
            if (o(kVar, this.f6787a, onDismiss)) {
                it.remove();
                return true;
            }
            if (kVar.i()) {
                it.remove();
            }
        }
        return false;
    }

    @Override // be.h
    public void e(@m80.k k guider) {
        g0.p(guider, "guider");
        this.f6788b.put(guider.getClass(), guider);
    }

    public boolean o(@m80.k k guider, @m80.k final ViewGroup parent, @m80.k final x00.a<g2> onDismiss) {
        g0.p(guider, "guider");
        g0.p(parent, "parent");
        g0.p(onDismiss, "onDismiss");
        if (guider.a()) {
            return false;
        }
        Triple<Integer, Integer, Integer> A = guider.A();
        int intValue = A.component1().intValue();
        if (parent.findViewById(A.component2().intValue()) != null) {
            return true;
        }
        final View inflate = LayoutInflater.from(parent.getContext()).inflate(intValue, parent, false);
        inflate.setAlpha(0.0f);
        parent.addView(inflate);
        g0.m(inflate);
        guider.B(parent, inflate, null, null, new x00.a() { // from class: be.n
            @Override // x00.a
            public final Object invoke() {
                g2 p11;
                p11 = s.p(parent, inflate, onDismiss);
                return p11;
            }
        });
        ViewCompat.setBackground(inflate, new ColorDrawable(guider.p()));
        if (!guider.v()) {
            inflate.setOnTouchListener(new View.OnTouchListener() { // from class: be.o
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean q11;
                    q11 = s.q(view, motionEvent);
                    return q11;
                }
            });
        }
        inflate.animate().alpha(1.0f).start();
        return true;
    }
}
