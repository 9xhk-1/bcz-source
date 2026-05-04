package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.g0;
import com.badlogic.gdx.scenes.scene2d.ui.k;
import com.badlogic.gdx.scenes.scene2d.ui.v;
import com.badlogic.gdx.scenes.scene2d.utils.FocusListener;
import z2.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f extends g0 {
    public Table M1;
    public Table N1;

    @a3.d0
    public q O1;
    public com.badlogic.gdx.utils.l<com.badlogic.gdx.scenes.scene2d.a, Object> P1;
    public boolean Q1;
    public com.badlogic.gdx.scenes.scene2d.a R1;
    public com.badlogic.gdx.scenes.scene2d.a S1;
    public FocusListener T1;
    public com.badlogic.gdx.scenes.scene2d.b U1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends com.badlogic.gdx.scenes.scene2d.b {
        public a() {
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean i(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
            inputEvent.a();
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends z2.d {
        public b() {
        }

        @Override // z2.d
        public void b(d.a aVar, com.badlogic.gdx.scenes.scene2d.a aVar2) {
            f fVar;
            if (f.this.P1.b(aVar2)) {
                while (true) {
                    x2.d A1 = aVar2.A1();
                    fVar = f.this;
                    if (A1 == fVar.N1) {
                        break;
                    } else {
                        aVar2 = aVar2.A1();
                    }
                }
                fVar.K5(fVar.P1.k(aVar2));
                f fVar2 = f.this;
                if (!fVar2.Q1) {
                    fVar2.hide();
                }
                f.this.Q1 = false;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends FocusListener {
        public c() {
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.FocusListener
        public void b(FocusListener.FocusEvent focusEvent, com.badlogic.gdx.scenes.scene2d.a aVar, boolean z11) {
            if (z11) {
                return;
            }
            d(focusEvent);
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.FocusListener
        public void c(FocusListener.FocusEvent focusEvent, com.badlogic.gdx.scenes.scene2d.a aVar, boolean z11) {
            if (z11) {
                return;
            }
            d(focusEvent);
        }

        public final void d(FocusListener.FocusEvent focusEvent) {
            com.badlogic.gdx.scenes.scene2d.a q11;
            com.badlogic.gdx.scenes.scene2d.c F1 = f.this.F1();
            if (!f.this.A1 || F1 == null || F1.t1().q3().f13179b <= 0 || F1.t1().q3().peek() != f.this || (q11 = focusEvent.q()) == null || q11.V1(f.this) || q11.equals(f.this.R1) || q11.equals(f.this.S1)) {
                return;
            }
            focusEvent.a();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends com.badlogic.gdx.scenes.scene2d.b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f12922b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f12923c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                f.this.K5(dVar.f12923c);
                f fVar = f.this;
                if (!fVar.Q1) {
                    fVar.hide();
                }
                f.this.Q1 = false;
            }
        }

        public d(int i11, Object obj) {
            this.f12922b = i11;
            this.f12923c = obj;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean d(InputEvent inputEvent, int i11) {
            if (this.f12922b != i11) {
                return false;
            }
            q1.g.f81378a.q(new a());
            return false;
        }
    }

    public f(String str, q qVar) {
        super(str, (g0.d) qVar.R(g0.d.class));
        this.P1 = new com.badlogic.gdx.utils.l<>();
        this.U1 = new a();
        g5(qVar);
        this.O1 = qVar;
        I5();
    }

    private void I5() {
        u5(true);
        g4().x1(6.0f);
        Table table = new Table(this.O1);
        this.M1 = table;
        I3(table).q0();
        b5();
        Table table2 = new Table(this.O1);
        this.N1 = table2;
        I3(table2).q();
        this.M1.g4().x1(6.0f);
        this.N1.g4().x1(6.0f);
        this.N1.d1(new b());
        this.T1 = new c();
    }

    public f A5(com.badlogic.gdx.scenes.scene2d.ui.a aVar, @a3.d0 Object obj) {
        this.N1.I3(aVar);
        L5(aVar, obj);
        return this;
    }

    public f B5(@a3.d0 String str) {
        return C5(str, null);
    }

    public f C5(@a3.d0 String str, @a3.d0 Object obj) {
        q qVar = this.O1;
        if (qVar != null) {
            return D5(str, obj, (v.a) qVar.R(v.a.class));
        }
        throw new IllegalStateException("This method may only be used if the dialog was constructed with a Skin.");
    }

    public f D5(@a3.d0 String str, @a3.d0 Object obj, v.a aVar) {
        return A5(new v(str, aVar), obj);
    }

    public void E5() {
        this.Q1 = true;
    }

    public Table F5() {
        return this.N1;
    }

    public Table G5() {
        return this.M1;
    }

    public void H5(@a3.d0 x2.a aVar) {
        com.badlogic.gdx.scenes.scene2d.c F1 = F1();
        if (F1 != null) {
            m2(this.T1);
            com.badlogic.gdx.scenes.scene2d.a aVar2 = this.R1;
            if (aVar2 != null && aVar2.F1() == null) {
                this.R1 = null;
            }
            com.badlogic.gdx.scenes.scene2d.a s12 = F1.s1();
            if (s12 == null || s12.V1(this)) {
                F1.L1(this.R1);
            }
            com.badlogic.gdx.scenes.scene2d.a aVar3 = this.S1;
            if (aVar3 != null && aVar3.F1() == null) {
                this.S1 = null;
            }
            com.badlogic.gdx.scenes.scene2d.a u12 = F1.u1();
            if (u12 == null || u12.V1(this)) {
                F1.N1(this.S1);
            }
        }
        if (aVar == null) {
            j2();
        } else {
            c1(this.U1);
            b1(y2.a.i0(aVar, y2.a.P(this.U1, true), y2.a.N()));
        }
    }

    public f J5(int i11, @a3.d0 Object obj) {
        d1(new d(i11, obj));
        return this;
    }

    @Override // x2.d, com.badlogic.gdx.scenes.scene2d.a
    public void K2(com.badlogic.gdx.scenes.scene2d.c cVar) {
        if (cVar == null) {
            d1(this.T1);
        } else {
            m2(this.T1);
        }
        super.K2(cVar);
    }

    public void L5(com.badlogic.gdx.scenes.scene2d.a aVar, @a3.d0 Object obj) {
        this.P1.r(aVar, obj);
    }

    public f M5(com.badlogic.gdx.scenes.scene2d.c cVar) {
        N5(cVar, y2.a.h0(y2.a.g(0.0f), y2.a.p(0.4f, com.badlogic.gdx.math.l.f12619e)));
        C2(Math.round((cVar.w1() - J1()) / 2.0f), Math.round((cVar.r1() - v1()) / 2.0f));
        return this;
    }

    public f N5(com.badlogic.gdx.scenes.scene2d.c cVar, @a3.d0 x2.a aVar) {
        h1();
        l2(this.U1);
        this.R1 = null;
        com.badlogic.gdx.scenes.scene2d.a s12 = cVar.s1();
        if (s12 != null && !s12.V1(this)) {
            this.R1 = s12;
        }
        this.S1 = null;
        com.badlogic.gdx.scenes.scene2d.a u12 = cVar.u1();
        if (u12 != null && !u12.V1(this)) {
            this.S1 = u12;
        }
        cVar.Q0(this);
        z();
        cVar.d1();
        cVar.L1(this);
        cVar.N1(this);
        if (aVar != null) {
            b1(aVar);
        }
        return this;
    }

    public f O5(k kVar) {
        this.M1.I3(kVar);
        return this;
    }

    public f P5(@a3.d0 String str) {
        q qVar = this.O1;
        if (qVar != null) {
            return Q5(str, (k.a) qVar.R(k.a.class));
        }
        throw new IllegalStateException("This method may only be used if the dialog was constructed with a Skin.");
    }

    public f Q5(@a3.d0 String str, k.a aVar) {
        return O5(new k(str, aVar));
    }

    public void hide() {
        H5(y2.a.r(0.4f, com.badlogic.gdx.math.l.f12619e));
    }

    public f z5(com.badlogic.gdx.scenes.scene2d.ui.a aVar) {
        return A5(aVar, null);
    }

    public f(String str, q qVar, String str2) {
        super(str, (g0.d) qVar.X(str2, g0.d.class));
        this.P1 = new com.badlogic.gdx.utils.l<>();
        this.U1 = new a();
        g5(qVar);
        this.O1 = qVar;
        I5();
    }

    public f(String str, g0.d dVar) {
        super(str, dVar);
        this.P1 = new com.badlogic.gdx.utils.l<>();
        this.U1 = new a();
        I5();
    }

    public void K5(@a3.d0 Object obj) {
    }
}
