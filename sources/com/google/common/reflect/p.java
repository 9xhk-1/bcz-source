package com.google.common.reflect;

import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@uo.f("Use ImmutableTypeToInstanceMap or MutableTypeToInstanceMap")
@d
/* loaded from: classes7.dex */
public interface p<B> extends Map<TypeToken<? extends B>, B> {
    @CheckForNull
    <T extends B> T Z(TypeToken<T> type);

    @CheckForNull
    <T extends B> T getInstance(Class<T> type);

    @CheckForNull
    @uo.a
    <T extends B> T h0(TypeToken<T> type, @k T value);

    @CheckForNull
    @uo.a
    <T extends B> T putInstance(Class<T> type, @k T value);
}
