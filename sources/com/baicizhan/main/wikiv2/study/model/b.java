package com.baicizhan.main.wikiv2.study.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nReportError.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportError.kt\ncom/baicizhan/main/wikiv2/study/model/ReportError\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1869#2:25\n1870#2:27\n1#3:26\n*S KotlinDebug\n*F\n+ 1 ReportError.kt\ncom/baicizhan/main/wikiv2/study/model/ReportError\n*L\n9#1:25\n9#1:27\n*E\n"})
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final int f25879c = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final TopicRecord f25880a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList<Integer> f25881b;

    public b(@k TopicRecord zpk, @k List<? extends Object> list) {
        g0.p(zpk, "zpk");
        g0.p(list, "list");
        this.f25880a = zpk;
        this.f25881b = new ArrayList<>();
        for (Object obj : list) {
            if (obj instanceof c) {
                this.f25881b.add(Integer.valueOf(R.string.error_fb_word_error_base));
                if (((c) obj).d() != null) {
                    this.f25881b.add(Integer.valueOf(R.string.error_fb_word_error_variant));
                }
            } else if (obj instanceof a) {
                this.f25881b.add(Integer.valueOf(R.string.error_fb_word_error_enmean));
            } else if (obj instanceof d) {
                this.f25881b.add(Integer.valueOf(R.string.error_fb_word_error_sentence));
            } else if (obj instanceof f) {
                this.f25881b.add(Integer.valueOf(R.string.error_fb_word_error_img));
            } else if (obj instanceof h) {
                this.f25881b.add(Integer.valueOf(R.string.error_fb_word_error_video));
            } else if (obj instanceof g) {
                this.f25881b.add(Integer.valueOf(R.string.error_fb_word_error_root));
            }
        }
    }

    @k
    public final ArrayList<Integer> a() {
        return this.f25881b;
    }

    @k
    public final TopicRecord b() {
        return this.f25880a;
    }
}
