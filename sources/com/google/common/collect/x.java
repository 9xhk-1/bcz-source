package com.google.common.collect;

import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
@uo.f("Use ImmutableClassToInstanceMap or MutableClassToInstanceMap")
/* loaded from: classes7.dex */
public interface x<B> extends Map<Class<? extends B>, B> {
    @CheckForNull
    <T extends B> T getInstance(Class<T> type);

    @CheckForNull
    @uo.a
    <T extends B> T putInstance(Class<T> type, @t7 T value);
}
