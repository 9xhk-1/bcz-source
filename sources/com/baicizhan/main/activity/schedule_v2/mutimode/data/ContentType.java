package com.baicizhan.main.activity.schedule_v2.mutimode.data;

import kotlin.jvm.internal.v;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ContentType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ ContentType[] $VALUES;

    @k
    public static final a Companion;

    /* renamed from: id, reason: collision with root package name */
    private final int f19274id;
    public static final ContentType TEXT = new ContentType("TEXT", 0, 1);
    public static final ContentType IMG = new ContentType("IMG", 1, 2);
    public static final ContentType GIF = new ContentType("GIF", 2, 3);
    public static final ContentType VIDEO = new ContentType("VIDEO", 3, 4);
    public static final ContentType UNKNOWN = new ContentType("UNKNOWN", 4, -1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final ContentType a(int i11) {
            return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? ContentType.UNKNOWN : ContentType.VIDEO : ContentType.GIF : ContentType.IMG : ContentType.TEXT;
        }

        public a() {
        }
    }

    private static final /* synthetic */ ContentType[] $values() {
        return new ContentType[]{TEXT, IMG, GIF, VIDEO, UNKNOWN};
    }

    static {
        ContentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
        Companion = new a(null);
    }

    private ContentType(String str, int i11, int i12) {
        this.f19274id = i12;
    }

    @k
    public static m00.a<ContentType> getEntries() {
        return $ENTRIES;
    }

    public static ContentType valueOf(String str) {
        return (ContentType) Enum.valueOf(ContentType.class, str);
    }

    public static ContentType[] values() {
        return (ContentType[]) $VALUES.clone();
    }

    public final int getId() {
        return this.f19274id;
    }
}
