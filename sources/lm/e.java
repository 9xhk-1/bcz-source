package lm;

import android.view.View;
import rm.h;
import rm.i;
import rm.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class e extends h.a implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public float[] f71522c = new float[2];

    /* renamed from: d, reason: collision with root package name */
    public l f71523d;

    /* renamed from: e, reason: collision with root package name */
    public float f71524e;

    /* renamed from: f, reason: collision with root package name */
    public float f71525f;

    /* renamed from: g, reason: collision with root package name */
    public i f71526g;

    /* renamed from: h, reason: collision with root package name */
    public View f71527h;

    public e(l lVar, float f11, float f12, i iVar, View view) {
        this.f71523d = lVar;
        this.f71524e = f11;
        this.f71525f = f12;
        this.f71526g = iVar;
        this.f71527h = view;
    }

    public float b() {
        return this.f71524e;
    }

    public float c() {
        return this.f71525f;
    }
}
