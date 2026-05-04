package com.baicizhan.biz.online.resource_api;

import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import m80.l;
import w00.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class GetTopicResourceChannel {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ GetTopicResourceChannel[] $VALUES;

    @k
    public static final a Companion;

    @g
    public final int value;
    public static final GetTopicResourceChannel SEARCH_WORD = new GetTopicResourceChannel("SEARCH_WORD", 0, 1);
    public static final GetTopicResourceChannel STUDY = new GetTopicResourceChannel("STUDY", 1, 2);
    public static final GetTopicResourceChannel WORD_LIST_LEARNED = new GetTopicResourceChannel("WORD_LIST_LEARNED", 2, 3);
    public static final GetTopicResourceChannel WORD_LIST_UNLEARNED = new GetTopicResourceChannel("WORD_LIST_UNLEARNED", 3, 4);
    public static final GetTopicResourceChannel WORD_LIST_KILLED = new GetTopicResourceChannel("WORD_LIST_KILLED", 4, 5);
    public static final GetTopicResourceChannel WORD_LIST_COLLECTED = new GetTopicResourceChannel("WORD_LIST_COLLECTED", 5, 6);
    public static final GetTopicResourceChannel LOOK_UP = new GetTopicResourceChannel("LOOK_UP", 6, 7);
    public static final GetTopicResourceChannel OTHER = new GetTopicResourceChannel("OTHER", 7, 9);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final GetTopicResourceChannel a(int i11) {
            switch (i11) {
                case 1:
                    return GetTopicResourceChannel.SEARCH_WORD;
                case 2:
                    return GetTopicResourceChannel.STUDY;
                case 3:
                    return GetTopicResourceChannel.WORD_LIST_LEARNED;
                case 4:
                    return GetTopicResourceChannel.WORD_LIST_UNLEARNED;
                case 5:
                    return GetTopicResourceChannel.WORD_LIST_KILLED;
                case 6:
                    return GetTopicResourceChannel.WORD_LIST_COLLECTED;
                case 7:
                    return GetTopicResourceChannel.LOOK_UP;
                case 8:
                default:
                    return null;
                case 9:
                    return GetTopicResourceChannel.OTHER;
            }
        }

        public a() {
        }
    }

    private static final /* synthetic */ GetTopicResourceChannel[] $values() {
        return new GetTopicResourceChannel[]{SEARCH_WORD, STUDY, WORD_LIST_LEARNED, WORD_LIST_UNLEARNED, WORD_LIST_KILLED, WORD_LIST_COLLECTED, LOOK_UP, OTHER};
    }

    static {
        GetTopicResourceChannel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private GetTopicResourceChannel(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<GetTopicResourceChannel> getEntries() {
        return $ENTRIES;
    }

    public static GetTopicResourceChannel valueOf(String str) {
        return (GetTopicResourceChannel) Enum.valueOf(GetTopicResourceChannel.class, str);
    }

    public static GetTopicResourceChannel[] values() {
        return (GetTopicResourceChannel[]) $VALUES.clone();
    }
}
