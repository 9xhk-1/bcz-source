package a90;

import ba0.g4;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k implements org.junit.jupiter.api.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2397a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2398b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f2399c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2400d;

    public k(int currentRepetition, int totalRepetitions, AtomicInteger failureCount, int failureThreshold) {
        this.f2397a = currentRepetition;
        this.f2398b = totalRepetitions;
        this.f2399c = failureCount;
        this.f2400d = failureThreshold;
    }

    @Override // org.junit.jupiter.api.c3
    public int a() {
        return this.f2397a;
    }

    @Override // org.junit.jupiter.api.c3
    public int b() {
        return this.f2398b;
    }

    @Override // org.junit.jupiter.api.c3
    public int c() {
        return this.f2399c.get();
    }

    @Override // org.junit.jupiter.api.c3
    public int d() {
        return this.f2400d;
    }

    public String toString() {
        return new g4(this).a("currentRepetition", Integer.valueOf(this.f2397a)).a("totalRepetitions", Integer.valueOf(this.f2398b)).a("failureCount", this.f2399c).a("failureThreshold", Integer.valueOf(this.f2400d)).toString();
    }
}
