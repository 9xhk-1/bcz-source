package com.baicizhan.main.phrasetraining.data.bean;

import android.content.res.AssetManager;
import android.text.TextUtils;
import bp.a;
import com.alipay.sdk.m.u.i;
import com.baicizhan.main.phrasetraining.data.bean.TopicPatterns;
import com.google.gson.d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class Phrase {
    private static final String PHRASE_PATH = "phrasetraining/packed_short_phrase.json";
    private String exam_info;
    private String explain_audio;
    private String img_option;
    private String mean_cn;
    private String sentence;
    private String sentence2;
    private String sentence2_audio;
    private String sentence2_word_highlight;
    private String sentence_audio;
    private String sentence_trans;
    private String sentence_word_highlight;
    private String sentencen2_trans;
    private String similar_highlight;
    private int topic_id;
    private String word;
    private String word_audio;
    private String word_image;

    public static Map<Integer, Phrase> getPrases(AssetManager assetManager) {
        BufferedReader bufferedReader;
        Throwable th2;
        InputStream inputStream;
        InputStream inputStream2;
        BufferedReader bufferedReader2;
        InputStream open;
        if (assetManager == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            try {
                open = assetManager.open(PHRASE_PATH);
            } catch (Throwable th3) {
                th2 = th3;
                inputStream = assetManager;
            }
            try {
                bufferedReader2 = new BufferedReader(new InputStreamReader(open, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb2.append(readLine);
                    } catch (IOException e11) {
                        e = e11;
                        inputStream2 = open;
                        e.printStackTrace();
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable unused) {
                            }
                        }
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        return null;
                    }
                }
                List<Phrase> list = (List) new d().o(sb2.toString(), new a<List<Phrase>>() { // from class: com.baicizhan.main.phrasetraining.data.bean.Phrase.2
                }.getType());
                if (list == null) {
                    c.d("", "phrases json parse unknown error.", new Object[0]);
                    try {
                        bufferedReader2.close();
                    } catch (Throwable unused3) {
                    }
                    if (open != null) {
                        try {
                            open.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    return null;
                }
                HashMap hashMap = new HashMap(list.size());
                for (Phrase phrase : list) {
                    hashMap.put(Integer.valueOf(phrase.topic_id), phrase);
                }
                try {
                    bufferedReader2.close();
                } catch (Throwable unused5) {
                }
                if (open != null) {
                    try {
                        open.close();
                    } catch (Throwable unused6) {
                    }
                }
                return hashMap;
            } catch (IOException e12) {
                e = e12;
                bufferedReader2 = null;
                inputStream2 = open;
            } catch (Throwable th4) {
                bufferedReader = null;
                th2 = th4;
                inputStream = open;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused7) {
                    }
                }
                if (inputStream == null) {
                    throw th2;
                }
                try {
                    inputStream.close();
                    throw th2;
                } catch (Throwable unused8) {
                    throw th2;
                }
            }
        } catch (IOException e13) {
            e = e13;
            inputStream2 = null;
            bufferedReader2 = null;
        } catch (Throwable th5) {
            bufferedReader = null;
            th2 = th5;
            inputStream = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.baicizhan.main.phrasetraining.data.bean.Phrase> getPrasesList(android.content.res.AssetManager r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "phrasetraining/packed_short_phrase.json"
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
            com.baicizhan.main.phrasetraining.data.bean.Phrase$1 r4 = new com.baicizhan.main.phrasetraining.data.bean.Phrase$1     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
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
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.phrasetraining.data.bean.Phrase.getPrasesList(android.content.res.AssetManager):java.util.List");
    }

    public String getExamInfo() {
        return this.exam_info;
    }

    public String getExplainAudio() {
        return this.explain_audio;
    }

    public String getImgOption() {
        return this.img_option;
    }

    public String getMeanCn() {
        return this.mean_cn;
    }

    public String getSentence() {
        return this.sentence;
    }

    public String getSentence2() {
        return this.sentence2;
    }

    public String getSentence2Audio() {
        return this.sentence2_audio;
    }

    public String getSentence2WordHighlight() {
        return this.sentence2_word_highlight;
    }

    public String getSentenceAudio() {
        return this.sentence_audio;
    }

    public String getSentenceTrans() {
        return this.sentence_trans;
    }

    public String getSentenceWordHighlight() {
        return this.sentence_word_highlight;
    }

    public String getSentencen2Trans() {
        return this.sentencen2_trans;
    }

    public String getSimilarHighlight() {
        return this.similar_highlight;
    }

    public int getTopicId() {
        return this.topic_id;
    }

    public String getWord() {
        return this.word;
    }

    public String getWordAudio() {
        return this.word_audio;
    }

    public String getWordImage() {
        return this.word_image;
    }

    public String toString() {
        return "Phrase {topic_id: " + this.topic_id + "; word: " + this.word + "; word_image: " + this.word_image + "; word_audio: " + this.word_audio + "; sentence: " + this.sentence + "; explain_audio: " + this.explain_audio + "; sentence_audio: " + this.sentence_audio + "; sentence_trans: " + this.sentence_trans + "; mean_cn: " + this.mean_cn + "; exam_info: " + this.exam_info + "; img_option: " + this.img_option + "; sentence2: " + this.sentence2 + "; sentencen2_trans: " + this.sentencen2_trans + "; sentence2_audio: " + this.sentence2_audio + i.f11099d;
    }

    public static Map<Integer, Phrase> getPrases(TopicPatterns patterns, AssetManager am2) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        if (am2 == null || patterns == null || patterns.getArrTopics() == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            inputStream = am2.open(PHRASE_PATH);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb2.append(readLine);
                        } catch (IOException e11) {
                            e = e11;
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
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                                throw th;
                            } catch (Throwable unused4) {
                                throw th;
                            }
                        }
                        throw th;
                    }
                }
                List<Phrase> list = (List) new d().o(sb2.toString(), new a<List<Phrase>>() { // from class: com.baicizhan.main.phrasetraining.data.bean.Phrase.3
                }.getType());
                if (list == null) {
                    c.d("", "phrases json parse unknown error.", new Object[0]);
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused5) {
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable unused6) {
                        }
                    }
                    return null;
                }
                HashSet hashSet = new HashSet();
                for (TopicPatterns.Topic topic : patterns.getArrTopics()) {
                    hashSet.add(Integer.valueOf(topic.getTopicId()));
                    String groupedTopicIds = topic.getGroupedTopicIds();
                    if (!TextUtils.isEmpty(groupedTopicIds)) {
                        for (String str : groupedTopicIds.split(",")) {
                            hashSet.add(Integer.valueOf(str));
                        }
                    }
                }
                HashMap hashMap = new HashMap(list.size());
                for (Phrase phrase : list) {
                    if (hashSet.contains(Integer.valueOf(phrase.topic_id))) {
                        hashMap.put(Integer.valueOf(phrase.topic_id), phrase);
                    }
                }
                try {
                    bufferedReader.close();
                } catch (Throwable unused7) {
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable unused8) {
                    }
                }
                return hashMap;
            } catch (IOException e12) {
                e = e12;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e13) {
            e = e13;
            inputStream = null;
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }
}
