package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.models.ZResource;
import com.baicizhan.client.business.dataset.models.ZWiki;
import com.baicizhan.client.business.dataset.models.lookup.DictionaryRecord;
import java.util.ArrayList;
import java.util.List;
import kotlin.Triple;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@kotlin.jvm.internal.u0({"SMAP\nDataConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataConvert.kt\ncom/baicizhan/main/wikiv2/studyv2/data/DataConvert\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,442:1\n1#2:443\n*E\n"})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final int f26023b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26024a;

    public c(boolean z11) {
        this.f26024a = z11;
    }

    @m80.k
    public final List<?> a(@m80.k TopicRecord input) {
        x0 t02;
        a0 S;
        f0 a02;
        z P;
        kotlin.jvm.internal.g0.p(input, "input");
        ArrayList arrayList = new ArrayList();
        t02 = t.t0(input);
        arrayList.add(t02);
        arrayList.add(this.f26024a ? t.j0(input) : t.H(input));
        S = t.S(input);
        if (S != null) {
            arrayList.add(S);
        }
        a02 = t.a0(input);
        arrayList.add(a02);
        P = t.P(input);
        if (P != null) {
            arrayList.add(P);
        }
        return arrayList;
    }

    @m80.k
    public final List<?> b(@m80.k DictionaryRecord input) {
        x0 u02;
        kotlin.jvm.internal.g0.p(input, "input");
        ArrayList arrayList = new ArrayList();
        u02 = t.u0(input);
        arrayList.add(u02);
        arrayList.add(this.f26024a ? t.k0(input) : t.I(input));
        return arrayList;
    }

    @m80.k
    public final List<?> c(@m80.k Triple<ZResource, ZWiki, ? extends TopicRecord> input) {
        x0 v02;
        a0 T;
        f0 b02;
        z Q;
        kotlin.jvm.internal.g0.p(input, "input");
        ArrayList arrayList = new ArrayList();
        v02 = t.v0(input);
        arrayList.add(v02);
        arrayList.add(this.f26024a ? t.l0(input) : t.J(input));
        T = t.T(input);
        if (T != null) {
            arrayList.add(T);
        }
        b02 = t.b0(input);
        arrayList.add(b02);
        Q = t.Q(input);
        if (Q != null) {
            arrayList.add(Q);
        }
        return arrayList;
    }
}
