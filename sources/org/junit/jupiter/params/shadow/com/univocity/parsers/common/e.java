package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public Map<NormalizedString, Integer> f78089a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f78090b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f78091c = null;

    /* renamed from: d, reason: collision with root package name */
    public final i f78092d;

    /* renamed from: e, reason: collision with root package name */
    public final x f78093e;

    public e(i iVar, x xVar) {
        this.f78092d = iVar;
        this.f78093e = xVar;
    }

    public int a(Enum<?> r82) {
        int[] iArr = this.f78090b;
        if (iArr != null && iArr.length == 0) {
            return -1;
        }
        d(r82);
        if (this.f78090b == null) {
            NormalizedString[] identifierGroupArray = NormalizedString.toIdentifierGroupArray(this.f78092d.a());
            if (identifierGroupArray == null) {
                this.f78090b = new int[0];
                return -1;
            }
            Enum[] enumArr = (Enum[]) r82.getClass().getEnumConstants();
            int i11 = Integer.MIN_VALUE;
            for (int i12 = 0; i12 < enumArr.length; i12++) {
                if (i11 < enumArr[i12].ordinal()) {
                    i11 = enumArr[i12].ordinal();
                }
            }
            this.f78090b = new int[i11 + 1];
            x xVar = this.f78093e;
            j90.m e11 = this.f78092d.c() ? xVar == null ? null : xVar.e() : null;
            for (Enum r32 : enumArr) {
                this.f78090b[r32.ordinal()] = d.h(identifierGroupArray, NormalizedString.valueOf(r32.toString()), e11);
            }
        }
        return this.f78090b[r82.ordinal()];
    }

    public int b(String str) {
        Map<NormalizedString, Integer> map = this.f78089a;
        if (map != null && map.isEmpty()) {
            return -1;
        }
        d(str);
        NormalizedString valueOf = NormalizedString.valueOf(str);
        if (this.f78089a == null) {
            NormalizedString[] identifierGroupArray = NormalizedString.toIdentifierGroupArray(this.f78092d.a());
            if (identifierGroupArray == null) {
                this.f78089a = Collections.EMPTY_MAP;
                return -1;
            }
            this.f78089a = new HashMap(identifierGroupArray.length);
            int[] g11 = this.f78092d.g();
            this.f78091c = g11;
            int i11 = 0;
            if (g11 == null) {
                while (i11 < identifierGroupArray.length) {
                    this.f78089a.put(identifierGroupArray[i11], Integer.valueOf(i11));
                    i11++;
                }
            } else if (this.f78092d.c()) {
                int[] x11 = d.x(this.f78091c, -1);
                while (i11 < x11.length) {
                    this.f78089a.put(identifierGroupArray[x11[i11]], Integer.valueOf(i11));
                    i11++;
                }
            } else {
                while (i11 < this.f78091c.length && i11 < identifierGroupArray.length) {
                    this.f78089a.put(identifierGroupArray[i11], Integer.valueOf(i11));
                    i11++;
                }
            }
        }
        Integer num = this.f78089a.get(valueOf);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public void c() {
        this.f78089a = null;
        this.f78090b = null;
        this.f78091c = null;
    }

    public final void d(Object obj) {
        if (obj == null) {
            if (this.f78092d.a() == null) {
                throw new IllegalArgumentException("Header name cannot be null.");
            }
            throw new IllegalArgumentException("Header name cannot be null. Use one of the available column names: " + Arrays.asList(this.f78092d.a()));
        }
    }
}
