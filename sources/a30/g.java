package a30;

import a30.m0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface g<A> {
    @m80.k
    List<A> b(@m80.k m0.a aVar);

    @m80.k
    List<A> d(@m80.k ProtoBuf.Type type, @m80.k k20.c cVar);

    @m80.k
    List<A> e(@m80.k ProtoBuf.TypeParameter typeParameter, @m80.k k20.c cVar);

    @m80.k
    List<A> f(@m80.k m0 m0Var, @m80.k ProtoBuf.Property property);

    @m80.k
    A g(@m80.k ProtoBuf.Annotation annotation, @m80.k k20.c cVar);

    @m80.k
    List<A> h(@m80.k m0 m0Var, @m80.k ProtoBuf.Property property);

    @m80.k
    List<A> i(@m80.k m0 m0Var, @m80.k ProtoBuf.EnumEntry enumEntry);

    @m80.k
    List<A> j(@m80.k m0 m0Var, @m80.k kotlin.reflect.jvm.internal.impl.protobuf.n nVar, @m80.k AnnotatedCallableKind annotatedCallableKind);

    @m80.k
    List<A> k(@m80.k m0 m0Var, @m80.k kotlin.reflect.jvm.internal.impl.protobuf.n nVar, @m80.k AnnotatedCallableKind annotatedCallableKind);

    @m80.k
    List<A> l(@m80.k m0 m0Var, @m80.k kotlin.reflect.jvm.internal.impl.protobuf.n nVar, @m80.k AnnotatedCallableKind annotatedCallableKind, int i11, @m80.k ProtoBuf.ValueParameter valueParameter);
}
