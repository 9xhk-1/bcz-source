package com.baicizhan.main.phrasetraining.data.bean;

import com.alipay.sdk.m.u.i;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PhraseGroup {
    private static final String PHRASE_GROUPS_PATH = "phrasetraining/get_all_short_phrase_groups.json";
    public static final String TAG = "PhraseGroup";
    private List<Phrase> arr_short_phrase;
    private int group_id;
    private int group_num;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Phrase {
        private int topic_id;
        private String word;

        public int getTopicId() {
            return this.topic_id;
        }

        public String getWord() {
            return this.word;
        }

        public String toString() {
            return "Phrase {topic_id: " + this.topic_id + "; word: " + this.word + i.f11099d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.baicizhan.main.phrasetraining.data.bean.PhraseGroup> getPhraseGroups(android.content.res.AssetManager r6) {
        /*
            java.lang.String r0 = "PhraseGroup"
            r1 = 0
            if (r6 != 0) goto Le
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r2 = "phrase group get failed for am null."
            qb.c.d(r0, r2, r6)
            return r1
        Le:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "phrasetraining/get_all_short_phrase_groups.json"
            java.io.InputStream r6 = r6.open(r3)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            java.lang.String r5 = "UTF-8"
            r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L25:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32
            if (r4 == 0) goto L34
            r2.append(r4)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32
            goto L25
        L2f:
            r0 = move-exception
            r1 = r3
            goto L73
        L32:
            r2 = move-exception
            goto L60
        L34:
            com.google.gson.d r4 = new com.google.gson.d     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32
            r4.<init>()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32
            com.baicizhan.main.phrasetraining.data.bean.PhraseGroup$1 r5 = new com.baicizhan.main.phrasetraining.data.bean.PhraseGroup$1     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32
            r5.<init>()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32
            java.lang.reflect.Type r5 = r5.getType()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32
            java.lang.Object r2 = r4.o(r2, r5)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32
            r3.close()     // Catch: java.lang.Throwable -> L4f
        L4f:
            if (r6 == 0) goto L54
            r6.close()     // Catch: java.lang.Throwable -> L54
        L54:
            return r2
        L55:
            r0 = move-exception
            goto L73
        L57:
            r2 = move-exception
            r3 = r1
            goto L60
        L5a:
            r0 = move-exception
            r6 = r1
            goto L73
        L5d:
            r2 = move-exception
            r6 = r1
            r3 = r6
        L60:
            java.lang.String r4 = "phrase group get failed. "
            qb.c.c(r0, r4, r2)     // Catch: java.lang.Throwable -> L2f
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L6d
            r3.close()     // Catch: java.lang.Throwable -> L6d
        L6d:
            if (r6 == 0) goto L72
            r6.close()     // Catch: java.lang.Throwable -> L72
        L72:
            return r1
        L73:
            if (r1 == 0) goto L78
            r1.close()     // Catch: java.lang.Throwable -> L78
        L78:
            if (r6 == 0) goto L7d
            r6.close()     // Catch: java.lang.Throwable -> L7d
        L7d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.phrasetraining.data.bean.PhraseGroup.getPhraseGroups(android.content.res.AssetManager):java.util.List");
    }

    public int getGroupId() {
        return this.group_id;
    }

    public int getGroupNum() {
        return this.group_num;
    }

    public List<Phrase> getPhrases() {
        return this.arr_short_phrase;
    }

    public String toString() {
        return "PhraseGroup {group_id: " + this.group_id + "; group_num: " + this.group_num + "; arr_short_phrase: " + this.arr_short_phrase + i.f11099d;
    }
}
