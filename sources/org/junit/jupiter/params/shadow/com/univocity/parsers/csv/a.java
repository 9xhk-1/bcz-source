package org.junit.jupiter.params.shadow.com.univocity.parsers.csv;

import j90.j;
import j90.k;
import j90.l;
import j90.m;
import j90.n;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.h;
import s90.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a extends h<b> {

    /* renamed from: t, reason: collision with root package name */
    public boolean f78223t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f78224u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f78225v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f78226w = true;

    /* renamed from: x, reason: collision with root package name */
    public char[] f78227x = new char[0];

    /* renamed from: y, reason: collision with root package name */
    public boolean f78228y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f78229z = true;
    public m A = null;

    public char[] A0() {
        return this.f78227x;
    }

    public boolean B0() {
        return this.f78224u;
    }

    public boolean E0() {
        return this.f78229z;
    }

    public final m F0() {
        return this.A;
    }

    public boolean G0() {
        return this.f78223t;
    }

    public final boolean I0() {
        return this.f78225v;
    }

    public boolean J0() {
        return this.f78226w;
    }

    public boolean M0(char c11) {
        int i11 = 0;
        while (true) {
            char[] cArr = this.f78227x;
            if (i11 >= cArr.length) {
                return false;
            }
            if (cArr[i11] == c11) {
                return true;
            }
            i11++;
        }
    }

    public boolean N0() {
        return this.f78228y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> n<T> O(n<T> nVar, T... tArr) {
        this.A = (m) nVar;
        nVar.b(tArr);
        return nVar;
    }

    public final n<Enum> O0(Enum... enumArr) {
        return O(new j(), enumArr);
    }

    public final n<String> P0(String... strArr) {
        return O(new l(), strArr);
    }

    public final n<Integer> S0(Integer... numArr) {
        return O(new k(), numArr);
    }

    public void T0(boolean z11) {
        this.f78223t = z11;
    }

    public final void U0(boolean z11) {
        this.f78225v = z11;
    }

    public void V0(boolean z11) {
        this.f78226w = z11;
    }

    public void W0(char... cArr) {
        if (cArr == null) {
            cArr = new char[0];
        }
        this.f78227x = cArr;
    }

    public void X0(boolean z11) {
        this.f78224u = z11;
    }

    public void Y0(boolean z11) {
        this.f78228y = z11;
    }

    public void Z0(boolean z11) {
        this.f78229z = z11;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.h, org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    public void a(Map<String, Object> map) {
        super.a(map);
        map.put("Quote all fields", Boolean.valueOf(this.f78224u));
        map.put("Escape unquoted values", Boolean.valueOf(this.f78223t));
        map.put("Normalize escaped line separators", Boolean.valueOf(this.f78226w));
        map.put("Input escaped", Boolean.valueOf(this.f78225v));
        map.put("Quote escaping enabled", Boolean.valueOf(this.f78228y));
        map.put("Quotation triggers", Arrays.toString(this.f78227x));
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.h
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public final a clone() {
        return (a) super.clone();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.h
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final a e(boolean z11) {
        return (a) super.e(z11);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public b f() {
        return new b();
    }
}
