package kotlin.collections.builders;

import a00.h0;
import a00.v1;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
/* loaded from: classes8.dex */
public final class SerializedCollection implements Externalizable {

    @k
    public static final a Companion = new a(null);
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;

    @k
    private Collection<?> collection;
    private final int tag;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public SerializedCollection(@k Collection<?> collection, int i11) {
        g0.p(collection, "collection");
        this.collection = collection;
        this.tag = i11;
    }

    private final Object readResolve() {
        return this.collection;
    }

    @Override // java.io.Externalizable
    public void readExternal(@k ObjectInput input) {
        List b11;
        g0.p(input, "input");
        byte readByte = input.readByte();
        int i11 = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        int i12 = 0;
        if (i11 == 0) {
            List k11 = a00.g0.k(readInt);
            while (i12 < readInt) {
                k11.add(input.readObject());
                i12++;
            }
            b11 = a00.g0.b(k11);
        } else {
            if (i11 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i11 + '.');
            }
            Set e11 = v1.e(readInt);
            while (i12 < readInt) {
                e11.add(input.readObject());
                i12++;
            }
            b11 = v1.a(e11);
        }
        this.collection = b11;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@k ObjectOutput output) {
        g0.p(output, "output");
        output.writeByte(this.tag);
        output.writeInt(this.collection.size());
        Iterator<?> it = this.collection.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public SerializedCollection() {
        this(h0.J(), 0);
    }
}
