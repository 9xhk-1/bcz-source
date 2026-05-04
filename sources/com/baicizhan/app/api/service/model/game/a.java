package com.baicizhan.app.api.service.model.game;

import f50.i;
import h50.e;
import h50.f;
import h50.l;
import i50.h;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a implements i<RewardType> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f13475a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final f f13476b = l.c("RewardType", e.f.f58516a);

    @Override // f50.i, f50.b0, f50.e
    @k
    public f a() {
        return f13476b;
    }

    @Override // f50.e
    @k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public RewardType e(@k i50.f decoder) {
        g0.p(decoder, "decoder");
        return RewardType.Companion.a(decoder.decodeInt());
    }

    @Override // f50.b0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@k h encoder, @k RewardType value) {
        g0.p(encoder, "encoder");
        g0.p(value, "value");
        encoder.encodeInt(value.getValue());
    }
}
