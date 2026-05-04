package com.baicizhan.app.biz.synservice.version;

import m00.c;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface IVersionRepo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class VersionType {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ VersionType[] $VALUES;
        public static final VersionType AllBooks = new VersionType("AllBooks", 0);
        public static final VersionType UserBooks = new VersionType("UserBooks", 1);

        private static final /* synthetic */ VersionType[] $values() {
            return new VersionType[]{AllBooks, UserBooks};
        }

        static {
            VersionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
        }

        private VersionType(String str, int i11) {
        }

        @k
        public static m00.a<VersionType> getEntries() {
            return $ENTRIES;
        }

        public static VersionType valueOf(String str) {
            return (VersionType) Enum.valueOf(VersionType.class, str);
        }

        public static VersionType[] values() {
            return (VersionType[]) $VALUES.clone();
        }
    }

    @l
    Object a(@k j00.c<? super g2> cVar);

    @l
    Object b(@k VersionType versionType, @k j00.c<? super Long> cVar);
}
