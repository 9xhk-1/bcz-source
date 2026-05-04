package com.igexin.push.core.b;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class k implements Comparable<k> {

    /* renamed from: a, reason: collision with root package name */
    public long f37796a;

    /* renamed from: b, reason: collision with root package name */
    public String f37797b;

    /* renamed from: c, reason: collision with root package name */
    public String f37798c;

    /* renamed from: d, reason: collision with root package name */
    public String f37799d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f37800e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f37801f;

    /* renamed from: g, reason: collision with root package name */
    public String f37802g;

    /* renamed from: h, reason: collision with root package name */
    public int f37803h;

    /* renamed from: i, reason: collision with root package name */
    public long f37804i;

    /* renamed from: j, reason: collision with root package name */
    private String f37805j;

    /* renamed from: k, reason: collision with root package name */
    private long f37806k;

    /* renamed from: l, reason: collision with root package name */
    private int f37807l;

    /* renamed from: m, reason: collision with root package name */
    private long f37808m;

    /* renamed from: n, reason: collision with root package name */
    private int f37809n;

    /* renamed from: o, reason: collision with root package name */
    private int f37810o;

    public k(long j11, String str, String str2, String str3, byte[] bArr, byte[] bArr2, String str4, int i11, long j12) {
        this.f37796a = j11;
        this.f37797b = str;
        this.f37798c = str2;
        this.f37799d = str3;
        this.f37800e = bArr;
        this.f37801f = bArr2;
        this.f37802g = str4;
        this.f37803h = i11;
        this.f37804i = j12;
    }

    private int a(k kVar) {
        return (int) (this.f37806k - kVar.f37806k);
    }

    private long b() {
        return this.f37796a;
    }

    private String c() {
        return this.f37797b;
    }

    private String d() {
        return this.f37798c;
    }

    private String e() {
        return this.f37799d;
    }

    private String f() {
        return this.f37802g;
    }

    private int g() {
        return this.f37803h;
    }

    private long h() {
        return this.f37804i;
    }

    private int i() {
        return this.f37807l;
    }

    private long j() {
        return this.f37808m;
    }

    private int k() {
        return this.f37809n;
    }

    private int l() {
        return this.f37810o;
    }

    private byte[] m() {
        return this.f37801f;
    }

    private long n() {
        return this.f37806k;
    }

    private String o() {
        return this.f37805j;
    }

    private byte[] p() {
        return this.f37800e;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(k kVar) {
        return (int) (this.f37806k - kVar.f37806k);
    }

    public k(byte[] bArr, String str, long j11) {
        this.f37801f = bArr;
        this.f37805j = str;
        this.f37806k = j11;
    }

    private void b(int i11) {
        this.f37807l = i11;
    }

    private void c(int i11) {
        this.f37809n = i11;
    }

    private void d(int i11) {
        this.f37810o = i11;
    }

    private void e(String str) {
        this.f37805j = str;
    }

    public final JSONObject a() {
        try {
            return new JSONObject(this.f37805j);
        } catch (JSONException e11) {
            com.igexin.c.a.c.a.a(e11);
            return null;
        }
    }

    private void a(int i11) {
        this.f37803h = i11;
    }

    private void b(long j11) {
        this.f37804i = j11;
    }

    private void c(long j11) {
        this.f37806k = j11;
    }

    private void d(long j11) {
        this.f37808m = j11;
    }

    private void a(long j11) {
        this.f37796a = j11;
    }

    private void b(String str) {
        this.f37798c = str;
    }

    private void c(String str) {
        this.f37799d = str;
    }

    private void d(String str) {
        this.f37802g = str;
    }

    private void a(String str) {
        this.f37797b = str;
    }

    private void b(byte[] bArr) {
        this.f37800e = bArr;
    }

    private void a(byte[] bArr) {
        this.f37801f = bArr;
    }
}
