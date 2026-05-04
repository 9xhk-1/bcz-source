package androidx.room.util;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
final class ForeignKeyWithSequence implements Comparable<ForeignKeyWithSequence> {

    @k
    private final String from;

    /* renamed from: id, reason: collision with root package name */
    private final int f5374id;
    private final int sequence;

    /* renamed from: to, reason: collision with root package name */
    @k
    private final String f5375to;

    public ForeignKeyWithSequence(int i11, int i12, @k String from, @k String to2) {
        g0.p(from, "from");
        g0.p(to2, "to");
        this.f5374id = i11;
        this.sequence = i12;
        this.from = from;
        this.f5375to = to2;
    }

    @k
    public final String getFrom() {
        return this.from;
    }

    public final int getId() {
        return this.f5374id;
    }

    public final int getSequence() {
        return this.sequence;
    }

    @k
    public final String getTo() {
        return this.f5375to;
    }

    @Override // java.lang.Comparable
    public int compareTo(@k ForeignKeyWithSequence other) {
        g0.p(other, "other");
        int i11 = this.f5374id - other.f5374id;
        return i11 == 0 ? this.sequence - other.sequence : i11;
    }
}
