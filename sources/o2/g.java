package o2;

import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.graphics.h;
import com.badlogic.gdx.graphics.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public Graphics f75585a;

    /* renamed from: b, reason: collision with root package name */
    public f f75586b;

    /* renamed from: c, reason: collision with root package name */
    public e f75587c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f75588d = false;

    public g(Graphics graphics) {
        this.f75585a = graphics;
        i p11 = graphics.p();
        h q11 = graphics.q();
        com.badlogic.gdx.graphics.g f11 = graphics.f();
        if (p11 != null) {
            this.f75586b = new d(this, p11);
        } else if (q11 != null) {
            this.f75586b = new c(this, q11);
        } else if (f11 != null) {
            this.f75586b = new b(this, f11);
        } else {
            this.f75586b = new a(this, graphics.l());
        }
        this.f75587c = e.f75577a;
    }

    public void a() {
        if (this.f75588d) {
            f fVar = this.f75586b;
            if (fVar instanceof d) {
                this.f75585a.u(((d) fVar).f75576oi);
            }
            f fVar2 = this.f75586b;
            if (fVar2 instanceof c) {
                this.f75585a.y(((c) fVar2).f75575ni);
            }
            f fVar3 = this.f75586b;
            if (fVar3 instanceof b) {
                this.f75585a.k(((b) fVar3).f75574mi);
            }
            if (this.f75586b instanceof a) {
                Graphics graphics = this.f75585a;
                graphics.c(((a) graphics.l()).f75573mi);
            }
            q1.g.f81388k = this.f75585a.p();
            q1.g.f81387j = this.f75585a.q();
            q1.g.f81386i = this.f75585a.f();
            q1.g.f81385h = this.f75585a.l();
            q1.g.f81384g = this.f75585a.l();
            this.f75588d = false;
        }
    }

    public void b() {
        if (this.f75588d) {
            return;
        }
        com.badlogic.gdx.graphics.f fVar = this.f75586b;
        if (fVar instanceof i) {
            this.f75585a.u((i) fVar);
        }
        com.badlogic.gdx.graphics.f fVar2 = this.f75586b;
        if (fVar2 instanceof h) {
            this.f75585a.y((h) fVar2);
        }
        com.badlogic.gdx.graphics.f fVar3 = this.f75586b;
        if (fVar3 instanceof com.badlogic.gdx.graphics.g) {
            this.f75585a.k((com.badlogic.gdx.graphics.g) fVar3);
        }
        this.f75585a.c(this.f75586b);
        q1.g.f81388k = this.f75585a.p();
        q1.g.f81387j = this.f75585a.q();
        q1.g.f81386i = this.f75585a.f();
        q1.g.f81385h = this.f75585a.l();
        q1.g.f81384g = this.f75585a.l();
        this.f75588d = true;
    }

    public int c() {
        return this.f75586b.n5();
    }

    public int d() {
        return this.f75586b.o5();
    }

    public e e() {
        return this.f75587c;
    }

    public int f() {
        return this.f75586b.p5();
    }

    public int g() {
        return this.f75586b.q5();
    }

    public com.badlogic.gdx.math.i h() {
        return this.f75586b.r5();
    }

    public boolean i() {
        return this.f75588d;
    }

    public void j() {
        this.f75586b.s5();
    }

    public void k(e eVar) {
        this.f75587c = eVar;
    }
}
