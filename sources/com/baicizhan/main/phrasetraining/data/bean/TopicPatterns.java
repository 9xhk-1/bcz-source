package com.baicizhan.main.phrasetraining.data.bean;

import android.content.res.AssetManager;
import bp.a;
import com.alipay.sdk.m.u.i;
import com.google.gson.d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class TopicPatterns {
    private static final String TOPIC_PATTERNS_PATH = "phrasetraining/get_short_phrase_topics_by_group.json";
    private List<Topic> arr_topics;
    private int group_id;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Topic {
        private String grouped_options;
        private String grouped_topic_ids;
        private int is_do_example;
        private String tips;
        private int topic_id;
        private int type_hint;

        public String getGroupedOptions() {
            return this.grouped_options;
        }

        public String getGroupedTopicIds() {
            return this.grouped_topic_ids;
        }

        public int getIsDoExample() {
            return this.is_do_example;
        }

        public String getTips() {
            return this.tips;
        }

        public int getTopicId() {
            return this.topic_id;
        }

        public int getTypeHint() {
            return this.type_hint;
        }

        public String toString() {
            return "Topic {type_hint: " + this.type_hint + "; tips: " + this.tips + "; grouped_topic_ids: " + this.grouped_topic_ids + "; is_do_example: " + this.is_do_example + "; topic_id: " + this.topic_id + "; grouped_options: " + this.grouped_options + i.f11099d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.baicizhan.main.phrasetraining.data.bean.TopicPatterns> getTopicPatterns(android.content.res.AssetManager r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "phrasetraining/get_short_phrase_topics_by_group.json"
            java.io.InputStream r5 = r5.open(r2)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L56
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4e
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4e
            java.lang.String r4 = "UTF-8"
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4e
        L1b:
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            if (r3 == 0) goto L29
            r1.append(r3)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            goto L1b
        L25:
            r0 = move-exception
            goto L67
        L27:
            r1 = move-exception
            goto L59
        L29:
            com.google.gson.d r3 = new com.google.gson.d     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            r3.<init>()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            com.baicizhan.main.phrasetraining.data.bean.TopicPatterns$1 r4 = new com.baicizhan.main.phrasetraining.data.bean.TopicPatterns$1     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            r4.<init>()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            java.lang.reflect.Type r4 = r4.getType()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            java.lang.Object r1 = r3.o(r1, r4)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            r2.close()     // Catch: java.lang.Throwable -> L44
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.lang.Throwable -> L49
        L49:
            return r1
        L4a:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L67
        L4e:
            r1 = move-exception
            r2 = r0
            goto L59
        L51:
            r5 = move-exception
            r2 = r0
            r0 = r5
            r5 = r2
            goto L67
        L56:
            r1 = move-exception
            r5 = r0
            r2 = r5
        L59:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.lang.Throwable -> L61
        L61:
            if (r5 == 0) goto L66
            r5.close()     // Catch: java.lang.Throwable -> L66
        L66:
            return r0
        L67:
            if (r2 == 0) goto L6c
            r2.close()     // Catch: java.lang.Throwable -> L6c
        L6c:
            if (r5 == 0) goto L71
            r5.close()     // Catch: java.lang.Throwable -> L71
        L71:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.phrasetraining.data.bean.TopicPatterns.getTopicPatterns(android.content.res.AssetManager):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0026: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:39), block:B:84:0x0026 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.InputStream] */
    public static TopicPatterns getTopicPatternsOfGroup(int i11, AssetManager assetManager) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        TopicPatterns topicPatterns;
        BufferedReader bufferedReader3 = null;
        if (assetManager == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            try {
                assetManager = assetManager.open(TOPIC_PATTERNS_PATH);
            } catch (Throwable th2) {
                th = th2;
                bufferedReader3 = bufferedReader2;
            }
            try {
                bufferedReader = new BufferedReader(new InputStreamReader((InputStream) assetManager, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb2.append(readLine);
                    } catch (IOException e11) {
                        e = e11;
                        inputStream = assetManager;
                        e.printStackTrace();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        return null;
                    }
                }
                List list = (List) new d().o(sb2.toString(), new a<List<TopicPatterns>>() { // from class: com.baicizhan.main.phrasetraining.data.bean.TopicPatterns.2
                }.getType());
                if (list == null) {
                    c.d("", "topic patterns json parse unknown error.", new Object[0]);
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused3) {
                    }
                    if (assetManager != 0) {
                        try {
                            assetManager.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    return null;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        topicPatterns = null;
                        break;
                    }
                    topicPatterns = (TopicPatterns) it.next();
                    if (i11 == topicPatterns.group_id) {
                        break;
                    }
                }
                if (topicPatterns == null) {
                    c.d("", "topic patterns json parse error, group id is not exists [%d]", Integer.valueOf(i11));
                }
                try {
                    bufferedReader.close();
                } catch (Throwable unused5) {
                }
                if (assetManager != 0) {
                    try {
                        assetManager.close();
                    } catch (Throwable unused6) {
                    }
                }
                return topicPatterns;
            } catch (IOException e12) {
                e = e12;
                bufferedReader = null;
                inputStream = assetManager;
            } catch (Throwable th3) {
                th = th3;
                if (bufferedReader3 != null) {
                    try {
                        bufferedReader3.close();
                    } catch (Throwable unused7) {
                    }
                }
                if (assetManager == 0) {
                    throw th;
                }
                try {
                    assetManager.close();
                    throw th;
                } catch (Throwable unused8) {
                    throw th;
                }
            }
        } catch (IOException e13) {
            e = e13;
            inputStream = null;
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
            assetManager = 0;
        }
    }

    public List<Topic> getArrTopics() {
        return this.arr_topics;
    }

    public int getGroupId() {
        return this.group_id;
    }

    public String toString() {
        return "TopicPatterns {group_id: " + this.group_id + "; attr_topics: " + this.arr_topics + i.f11099d;
    }
}
