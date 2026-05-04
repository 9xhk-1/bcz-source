package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public final class m3<T> extends c<T> {

    /* renamed from: c, reason: collision with root package name */
    public final Queue<T> f33678c;

    public m3(Queue<T> queue) {
        this.f33678c = (Queue) Preconditions.checkNotNull(queue);
    }

    @Override // com.google.common.collect.c
    @CheckForNull
    public T a() {
        return this.f33678c.isEmpty() ? b() : this.f33678c.remove();
    }
}
