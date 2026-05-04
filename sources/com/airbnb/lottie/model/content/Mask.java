package com.airbnb.lottie.model.content;

import d1.d;
import d1.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Mask {

    /* renamed from: a, reason: collision with root package name */
    public final MaskMode f10006a;

    /* renamed from: b, reason: collision with root package name */
    public final h f10007b;

    /* renamed from: c, reason: collision with root package name */
    public final d f10008c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10009d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, h hVar, d dVar, boolean z11) {
        this.f10006a = maskMode;
        this.f10007b = hVar;
        this.f10008c = dVar;
        this.f10009d = z11;
    }

    public MaskMode a() {
        return this.f10006a;
    }

    public h b() {
        return this.f10007b;
    }

    public d c() {
        return this.f10008c;
    }

    public boolean d() {
        return this.f10009d;
    }
}
