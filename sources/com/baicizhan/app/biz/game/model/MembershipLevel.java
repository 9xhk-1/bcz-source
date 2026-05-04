package com.baicizhan.app.biz.game.model;

import java.util.Iterator;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class MembershipLevel {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ MembershipLevel[] $VALUES;

    @k
    public static final a Companion;
    private final int value;
    public static final MembershipLevel Free = new MembershipLevel("Free", 0, 0);
    public static final MembershipLevel Vip = new MembershipLevel("Vip", 1, 1);
    public static final MembershipLevel TrialVip = new MembershipLevel("TrialVip", 2, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMembership.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Membership.kt\ncom/baicizhan/app/biz/game/model/MembershipLevel$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n295#2,2:58\n*S KotlinDebug\n*F\n+ 1 Membership.kt\ncom/baicizhan/app/biz/game/model/MembershipLevel$Companion\n*L\n23#1:58,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final MembershipLevel a(int i11) {
            Object obj;
            Iterator<E> it = MembershipLevel.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((MembershipLevel) obj).getValue() == i11) {
                    break;
                }
            }
            MembershipLevel membershipLevel = (MembershipLevel) obj;
            return membershipLevel == null ? MembershipLevel.Free : membershipLevel;
        }

        public a() {
        }
    }

    private static final /* synthetic */ MembershipLevel[] $values() {
        return new MembershipLevel[]{Free, Vip, TrialVip};
    }

    static {
        MembershipLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private MembershipLevel(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<MembershipLevel> getEntries() {
        return $ENTRIES;
    }

    public static MembershipLevel valueOf(String str) {
        return (MembershipLevel) Enum.valueOf(MembershipLevel.class, str);
    }

    public static MembershipLevel[] values() {
        return (MembershipLevel[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
