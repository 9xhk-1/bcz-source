package bt;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<InterfaceC0121a> f7223a = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: bt.a$a, reason: collision with other inner class name */
    public interface InterfaceC0121a {
        void b(a aVar);

        void c(a aVar);

        void d(a aVar);

        void e(a aVar);
    }

    public void a(InterfaceC0121a interfaceC0121a) {
        if (this.f7223a == null) {
            this.f7223a = new ArrayList<>();
        }
        this.f7223a.add(interfaceC0121a);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            ArrayList<InterfaceC0121a> arrayList = this.f7223a;
            if (arrayList != null) {
                aVar.f7223a = new ArrayList<>();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    aVar.f7223a.add(arrayList.get(i11));
                }
            }
            return aVar;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public abstract long d();

    public ArrayList<InterfaceC0121a> e() {
        return this.f7223a;
    }

    public abstract long f();

    public abstract boolean g();

    public boolean h() {
        return g();
    }

    public void i() {
        ArrayList<InterfaceC0121a> arrayList = this.f7223a;
        if (arrayList != null) {
            arrayList.clear();
            this.f7223a = null;
        }
    }

    public void j(InterfaceC0121a interfaceC0121a) {
        ArrayList<InterfaceC0121a> arrayList = this.f7223a;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(interfaceC0121a);
        if (this.f7223a.size() == 0) {
            this.f7223a = null;
        }
    }

    public abstract a l(long j11);

    public abstract void m(Interpolator interpolator);

    public abstract void n(long j11);

    public void c() {
    }

    public void cancel() {
    }

    public void p() {
    }

    public void q() {
    }

    public void s() {
    }

    public void o(Object obj) {
    }
}
