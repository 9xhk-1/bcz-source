package com.google.common.collect;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.f9;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
@uo.j(containerOf = {"R", "C", ExifInterface.GPS_MEASUREMENT_INTERRUPTED})
/* loaded from: classes7.dex */
public final class b9<R, C, V> extends k8<R, C, V> {

    /* renamed from: e, reason: collision with root package name */
    public static final ImmutableTable<Object, Object, Object> f33284e = new b9(ImmutableList.of(), ImmutableSet.of(), ImmutableSet.of());

    /* renamed from: a, reason: collision with root package name */
    public final ImmutableMap<R, ImmutableMap<C, V>> f33285a;

    /* renamed from: b, reason: collision with root package name */
    public final ImmutableMap<C, ImmutableMap<R, V>> f33286b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f33287c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f33288d;

    /* JADX WARN: Multi-variable type inference failed */
    public b9(ImmutableList<f9.a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        ImmutableMap Q = u6.Q(immutableSet);
        LinkedHashMap c02 = u6.c0();
        aa<R> it = immutableSet.iterator();
        while (it.hasNext()) {
            c02.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap c03 = u6.c0();
        aa<C> it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            c03.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i11 = 0; i11 < immutableList.size(); i11++) {
            f9.a<R, C, V> aVar = immutableList.get(i11);
            R b11 = aVar.b();
            C a11 = aVar.a();
            V value = aVar.getValue();
            Integer num = (Integer) Q.get(b11);
            Objects.requireNonNull(num);
            iArr[i11] = num.intValue();
            Map map = (Map) c02.get(b11);
            Objects.requireNonNull(map);
            Map map2 = map;
            iArr2[i11] = map2.size();
            b(b11, a11, map2.put(a11, value), value);
            Map map3 = (Map) c03.get(a11);
            Objects.requireNonNull(map3);
            map3.put(b11, value);
        }
        this.f33287c = iArr;
        this.f33288d = iArr2;
        ImmutableMap.b bVar = new ImmutableMap.b(c02.size());
        for (Map.Entry entry : c02.entrySet()) {
            bVar.i(entry.getKey(), ImmutableMap.copyOf((Map) entry.getValue()));
        }
        this.f33285a = bVar.d();
        ImmutableMap.b bVar2 = new ImmutableMap.b(c03.size());
        for (Map.Entry entry2 : c03.entrySet()) {
            bVar2.i(entry2.getKey(), ImmutableMap.copyOf((Map) entry2.getValue()));
        }
        this.f33286b = bVar2.d();
    }

    @Override // com.google.common.collect.k8
    public f9.a<R, C, V> getCell(int index) {
        Map.Entry<R, ImmutableMap<C, V>> entry = this.f33285a.entrySet().asList().get(this.f33287c[index]);
        ImmutableMap<C, V> value = entry.getValue();
        Map.Entry<C, V> entry2 = value.entrySet().asList().get(this.f33288d[index]);
        return ImmutableTable.cellOf(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // com.google.common.collect.k8
    public V getValue(int index) {
        ImmutableMap<C, V> immutableMap = this.f33285a.values().asList().get(this.f33287c[index]);
        return immutableMap.values().asList().get(this.f33288d[index]);
    }

    @Override // com.google.common.collect.f9
    public int size() {
        return this.f33287c.length;
    }

    @Override // com.google.common.collect.k8, com.google.common.collect.ImmutableTable
    @go.d
    @go.c
    public Object writeReplace() {
        ImmutableMap Q = u6.Q(columnKeySet());
        int[] iArr = new int[cellSet().size()];
        aa<f9.a<R, C, V>> it = cellSet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Integer num = (Integer) Q.get(it.next().a());
            Objects.requireNonNull(num);
            iArr[i11] = num.intValue();
            i11++;
        }
        return ImmutableTable.b.a(this, this.f33287c, iArr);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.f9
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf((Map) this.f33286b);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.f9
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf((Map) this.f33285a);
    }
}
