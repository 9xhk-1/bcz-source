package com.baicizhan.main.examassistant;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import com.baicizhan.main.examassistant.data.MarkedWord;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class y extends DiffUtil.Callback {

    /* renamed from: c, reason: collision with root package name */
    public static final int f20707c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<Object> f20708a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<Object> f20709b;

    public y(@m80.k List<? extends Object> oldList, @m80.k List<? extends Object> newList) {
        kotlin.jvm.internal.g0.p(oldList, "oldList");
        kotlin.jvm.internal.g0.p(newList, "newList");
        this.f20708a = oldList;
        this.f20709b = newList;
    }

    @m80.k
    public final List<Object> a() {
        return this.f20709b;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int i11, int i12) {
        Object obj = this.f20708a.get(i11);
        Object obj2 = this.f20709b.get(i12);
        if ((obj instanceof ij.z) && (obj2 instanceof ij.z)) {
            ij.z zVar = (ij.z) obj;
            ij.z zVar2 = (ij.z) obj2;
            return zVar.w() == zVar2.w() && zVar.v() == zVar2.v();
        }
        if ((obj instanceof String) && (obj2 instanceof String)) {
            return kotlin.jvm.internal.g0.g(obj, obj2);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int i11, int i12) {
        Object obj = this.f20708a.get(i11);
        Object obj2 = this.f20709b.get(i12);
        if ((obj instanceof MarkedWord) && (obj2 instanceof MarkedWord)) {
            return ((MarkedWord) obj).n() == ((MarkedWord) obj2).n();
        }
        if ((obj instanceof String) && (obj2 instanceof String)) {
            return kotlin.jvm.internal.g0.g(obj, obj2);
        }
        return false;
    }

    @m80.k
    public final List<Object> b() {
        return this.f20708a;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        return this.f20709b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        return this.f20708a.size();
    }
}
