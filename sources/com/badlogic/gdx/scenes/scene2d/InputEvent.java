package com.badlogic.gdx.scenes.scene2d;

import a3.d0;
import com.badlogic.gdx.math.Vector2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class InputEvent extends x2.b {

    /* renamed from: i, reason: collision with root package name */
    public Type f12746i;

    /* renamed from: j, reason: collision with root package name */
    public float f12747j;

    /* renamed from: k, reason: collision with root package name */
    public float f12748k;

    /* renamed from: l, reason: collision with root package name */
    public float f12749l;

    /* renamed from: m, reason: collision with root package name */
    public float f12750m;

    /* renamed from: n, reason: collision with root package name */
    public int f12751n;

    /* renamed from: o, reason: collision with root package name */
    public int f12752o;

    /* renamed from: p, reason: collision with root package name */
    public int f12753p;

    /* renamed from: q, reason: collision with root package name */
    public char f12754q;

    /* renamed from: r, reason: collision with root package name */
    @d0
    public a f12755r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12756s = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Type {
        touchDown,
        touchUp,
        touchDragged,
        mouseMoved,
        enter,
        exit,
        scrolled,
        keyDown,
        keyUp,
        keyTyped
    }

    public Type A() {
        return this.f12746i;
    }

    public boolean B() {
        return this.f12747j == -2.14748365E9f || this.f12748k == -2.14748365E9f;
    }

    public void C(int i11) {
        this.f12752o = i11;
    }

    public void D(char c11) {
        this.f12754q = c11;
    }

    public void E(int i11) {
        this.f12753p = i11;
    }

    public void F(int i11) {
        this.f12751n = i11;
    }

    public void G(@d0 a aVar) {
        this.f12755r = aVar;
    }

    public void H(float f11) {
        this.f12749l = f11;
    }

    public void I(float f11) {
        this.f12750m = f11;
    }

    public void J(float f11) {
        this.f12747j = f11;
    }

    public void K(float f11) {
        this.f12748k = f11;
    }

    public void L(boolean z11) {
        this.f12756s = z11;
    }

    public void M(Type type) {
        this.f12746i = type;
    }

    public Vector2 N(a aVar, Vector2 vector2) {
        vector2.set(this.f12747j, this.f12748k);
        aVar.X2(vector2);
        return vector2;
    }

    public int q() {
        return this.f12752o;
    }

    public char r() {
        return this.f12754q;
    }

    @Override // x2.b, a3.j0.a
    public void reset() {
        super.reset();
        this.f12755r = null;
        this.f12752o = -1;
    }

    public int s() {
        return this.f12753p;
    }

    public int t() {
        return this.f12751n;
    }

    public String toString() {
        return this.f12746i.toString();
    }

    @d0
    public a u() {
        return this.f12755r;
    }

    public float v() {
        return this.f12749l;
    }

    public float w() {
        return this.f12750m;
    }

    public float x() {
        return this.f12747j;
    }

    public float y() {
        return this.f12748k;
    }

    public boolean z() {
        return this.f12756s;
    }
}
