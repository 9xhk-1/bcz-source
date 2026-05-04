package io.ktor.util.pipeline;

import c40.r0;
import io.ktor.utils.io.c0;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c0
/* loaded from: classes8.dex */
public abstract class d<TSubject, TContext> implements r0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final TContext f62057a;

    public d(@m80.k TContext context) {
        g0.p(context, "context");
        this.f62057a = context;
    }

    @m80.l
    public abstract Object a(@m80.k TSubject tsubject, @m80.k j00.c<? super TSubject> cVar);

    public abstract void b();

    @m80.k
    public final TContext d() {
        return this.f62057a;
    }

    @m80.k
    public abstract TSubject e();

    @m80.l
    public abstract Object h(@m80.k j00.c<? super TSubject> cVar);

    @m80.l
    public abstract Object i(@m80.k TSubject tsubject, @m80.k j00.c<? super TSubject> cVar);

    public abstract void l(@m80.k TSubject tsubject);
}
