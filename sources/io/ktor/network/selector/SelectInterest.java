package io.ktor.network.selector;

import a00.i0;
import a00.r0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSelectorManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectorManager.kt\nio/ktor/network/selector/SelectInterest\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n37#2,2:83\n1557#3:85\n1628#3,3:86\n*S KotlinDebug\n*F\n+ 1 SelectorManager.kt\nio/ktor/network/selector/SelectInterest\n*L\n75#1:83,2\n77#1:85\n77#1:86,3\n*E\n"})
/* loaded from: classes8.dex */
public final class SelectInterest {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ SelectInterest[] $VALUES;

    @k
    private static final SelectInterest[] AllInterests;

    @k
    public static final a Companion;

    @k
    private static final int[] flags;
    private static final int size;
    private final int flag;
    public static final SelectInterest READ = new SelectInterest("READ", 0, 1);
    public static final SelectInterest WRITE = new SelectInterest("WRITE", 1, 4);
    public static final SelectInterest ACCEPT = new SelectInterest("ACCEPT", 2, 16);
    public static final SelectInterest CONNECT = new SelectInterest("CONNECT", 3, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final SelectInterest[] a() {
            return SelectInterest.AllInterests;
        }

        @k
        public final int[] b() {
            return SelectInterest.flags;
        }

        public final int c() {
            return SelectInterest.size;
        }

        public a() {
        }
    }

    private static final /* synthetic */ SelectInterest[] $values() {
        return new SelectInterest[]{READ, WRITE, ACCEPT, CONNECT};
    }

    static {
        SelectInterest[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
        AllInterests = (SelectInterest[]) getEntries().toArray(new SelectInterest[0]);
        m00.a<SelectInterest> entries = getEntries();
        ArrayList arrayList = new ArrayList(i0.d0(entries, 10));
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((SelectInterest) it.next()).flag));
        }
        flags = r0.Z5(arrayList);
        size = getEntries().size();
    }

    private SelectInterest(String str, int i11, int i12) {
        this.flag = i12;
    }

    @k
    public static m00.a<SelectInterest> getEntries() {
        return $ENTRIES;
    }

    public static SelectInterest valueOf(String str) {
        return (SelectInterest) Enum.valueOf(SelectInterest.class, str);
    }

    public static SelectInterest[] values() {
        return (SelectInterest[]) $VALUES.clone();
    }

    public final int getFlag() {
        return this.flag;
    }
}
