package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.MediaCodecAudioRenderer;
import androidx.media3.exoplayer.image.ImageDecoder;
import androidx.media3.exoplayer.image.ImageRenderer;
import androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionRenderer;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class DefaultRenderersFactory implements RenderersFactory {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    public static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    private static final String TAG = "DefaultRenderersFactory";
    private final DefaultMediaCodecAdapterFactory codecAdapterFactory;
    private final Context context;
    private boolean enableAudioTrackPlaybackParams;
    private boolean enableDecoderFallback;
    private boolean enableFloatOutput;
    private boolean enableMediaCodecVideoRendererPrewarming;
    private boolean parseAv1SampleDependencies;
    private int extensionRendererMode = 0;
    private long allowedVideoJoiningTimeMs = 5000;
    private MediaCodecSelector mediaCodecSelector = MediaCodecSelector.DEFAULT;
    private long lateThresholdToDropDecoderInputUs = C.TIME_UNSET;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(Context context) {
        this.context = context;
        this.codecAdapterFactory = new DefaultMediaCodecAdapterFactory(context);
    }

    public void buildAudioRenderers(Context context, int i11, MediaCodecSelector mediaCodecSelector, boolean z11, AudioSink audioSink, Handler handler, AudioRendererEventListener audioRendererEventListener, ArrayList<Renderer> arrayList) {
        int i12;
        int i13;
        int i14;
        int i15;
        arrayList.add(new MediaCodecAudioRenderer(context, getCodecAdapterFactory(), mediaCodecSelector, z11, handler, audioRendererEventListener, audioSink));
        if (i11 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i11 == 2) {
            size--;
        }
        try {
            try {
                i12 = size + 1;
            } catch (ClassNotFoundException unused) {
            }
            try {
                arrayList.add(size, (Renderer) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(context, handler, audioRendererEventListener, audioSink));
                Log.i(TAG, "Loaded MidiRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i12;
                i12 = size;
                try {
                    i13 = i12 + 1;
                    try {
                        arrayList.add(i12, (Renderer) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        Log.i(TAG, "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i12 = i13;
                        i13 = i12;
                        try {
                            i14 = i13 + 1;
                            arrayList.add(i13, (Renderer) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                            Log.i(TAG, "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused4) {
                        }
                        try {
                            i15 = i14 + 1;
                            try {
                                arrayList.add(i14, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                                Log.i(TAG, "Loaded FfmpegAudioRenderer.");
                            } catch (ClassNotFoundException unused5) {
                                i14 = i15;
                                i15 = i14;
                                try {
                                    int i16 = i15 + 1;
                                    arrayList.add(i15, (Renderer) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(context, handler, audioRendererEventListener, audioSink));
                                    Log.i(TAG, "Loaded LibiamfAudioRenderer.");
                                } catch (ClassNotFoundException unused6) {
                                }
                                arrayList.add(i16, (Renderer) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                                Log.i(TAG, "Loaded MpeghAudioRenderer.");
                            }
                        } catch (ClassNotFoundException unused7) {
                        }
                        try {
                            int i162 = i15 + 1;
                            try {
                                arrayList.add(i15, (Renderer) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(context, handler, audioRendererEventListener, audioSink));
                                Log.i(TAG, "Loaded LibiamfAudioRenderer.");
                            } catch (ClassNotFoundException unused8) {
                                i15 = i162;
                                i162 = i15;
                                arrayList.add(i162, (Renderer) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                                Log.i(TAG, "Loaded MpeghAudioRenderer.");
                            }
                            arrayList.add(i162, (Renderer) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                            Log.i(TAG, "Loaded MpeghAudioRenderer.");
                        } catch (Exception e11) {
                            throw new IllegalStateException("Error instantiating IAMF extension", e11);
                        }
                    }
                } catch (ClassNotFoundException unused9) {
                }
                try {
                    i14 = i13 + 1;
                    try {
                        arrayList.add(i13, (Renderer) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        Log.i(TAG, "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused10) {
                        i13 = i14;
                        i14 = i13;
                        i15 = i14 + 1;
                        arrayList.add(i14, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        Log.i(TAG, "Loaded FfmpegAudioRenderer.");
                        int i1622 = i15 + 1;
                        arrayList.add(i15, (Renderer) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(context, handler, audioRendererEventListener, audioSink));
                        Log.i(TAG, "Loaded LibiamfAudioRenderer.");
                        arrayList.add(i1622, (Renderer) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        Log.i(TAG, "Loaded MpeghAudioRenderer.");
                    }
                    try {
                        i15 = i14 + 1;
                        arrayList.add(i14, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        Log.i(TAG, "Loaded FfmpegAudioRenderer.");
                        int i16222 = i15 + 1;
                        arrayList.add(i15, (Renderer) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(context, handler, audioRendererEventListener, audioSink));
                        Log.i(TAG, "Loaded LibiamfAudioRenderer.");
                        arrayList.add(i16222, (Renderer) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        Log.i(TAG, "Loaded MpeghAudioRenderer.");
                    } catch (Exception e12) {
                        throw new IllegalStateException("Error instantiating FFmpeg extension", e12);
                    }
                } catch (Exception e13) {
                    throw new IllegalStateException("Error instantiating FLAC extension", e13);
                }
            }
            try {
                i13 = i12 + 1;
                arrayList.add(i12, (Renderer) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                Log.i(TAG, "Loaded LibopusAudioRenderer.");
                i14 = i13 + 1;
                arrayList.add(i13, (Renderer) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                Log.i(TAG, "Loaded LibflacAudioRenderer.");
                i15 = i14 + 1;
                arrayList.add(i14, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                Log.i(TAG, "Loaded FfmpegAudioRenderer.");
                int i162222 = i15 + 1;
                arrayList.add(i15, (Renderer) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(context, handler, audioRendererEventListener, audioSink));
                Log.i(TAG, "Loaded LibiamfAudioRenderer.");
                try {
                    arrayList.add(i162222, (Renderer) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                    Log.i(TAG, "Loaded MpeghAudioRenderer.");
                } catch (ClassNotFoundException unused11) {
                } catch (Exception e14) {
                    throw new IllegalStateException("Error instantiating MPEG-H extension", e14);
                }
            } catch (Exception e15) {
                throw new IllegalStateException("Error instantiating Opus extension", e15);
            }
        } catch (Exception e16) {
            throw new IllegalStateException("Error instantiating MIDI extension", e16);
        }
    }

    @Nullable
    public AudioSink buildAudioSink(Context context, boolean z11, boolean z12) {
        return new DefaultAudioSink.Builder(context).setEnableFloatOutput(z11).setEnableAudioTrackPlaybackParams(z12).build();
    }

    public void buildCameraMotionRenderers(Context context, int i11, ArrayList<Renderer> arrayList) {
        arrayList.add(new CameraMotionRenderer());
    }

    public void buildImageRenderers(ArrayList<Renderer> arrayList) {
        arrayList.add(new ImageRenderer(getImageDecoderFactory(), null));
    }

    public void buildMetadataRenderers(Context context, MetadataOutput metadataOutput, Looper looper, int i11, ArrayList<Renderer> arrayList) {
        arrayList.add(new MetadataRenderer(metadataOutput, looper));
        arrayList.add(new MetadataRenderer(metadataOutput, looper));
    }

    @Nullable
    public Renderer buildSecondaryVideoRenderer(Renderer renderer, Context context, int i11, MediaCodecSelector mediaCodecSelector, boolean z11, Handler handler, VideoRendererEventListener videoRendererEventListener, long j11) {
        if (this.enableMediaCodecVideoRendererPrewarming && renderer.getClass() == MediaCodecVideoRenderer.class) {
            return new MediaCodecVideoRenderer.Builder(context).setCodecAdapterFactory(getCodecAdapterFactory()).setMediaCodecSelector(mediaCodecSelector).setAllowedJoiningTimeMs(j11).setEnableDecoderFallback(z11).setEventHandler(handler).setEventListener(videoRendererEventListener).setMaxDroppedFramesToNotify(50).experimentalSetParseAv1SampleDependencies(this.parseAv1SampleDependencies).experimentalSetLateThresholdToDropDecoderInputUs(this.lateThresholdToDropDecoderInputUs).build();
        }
        return null;
    }

    public void buildTextRenderers(Context context, TextOutput textOutput, Looper looper, int i11, ArrayList<Renderer> arrayList) {
        arrayList.add(new TextRenderer(textOutput, looper));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:3|(1:5)|6|7|8|(2:9|10)|11|12|13|14|15|(3:17|18|20)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
    
        r9 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void buildVideoRenderers(android.content.Context r15, int r16, androidx.media3.exoplayer.mediacodec.MediaCodecSelector r17, boolean r18, android.os.Handler r19, androidx.media3.exoplayer.video.VideoRendererEventListener r20, long r21, java.util.ArrayList<androidx.media3.exoplayer.Renderer> r23) {
        /*
            r14 = this;
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = r23
            java.lang.String r4 = "DefaultRenderersFactory"
            java.lang.Class r5 = java.lang.Integer.TYPE
            java.lang.Class<androidx.media3.exoplayer.video.VideoRendererEventListener> r6 = androidx.media3.exoplayer.video.VideoRendererEventListener.class
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            java.lang.Class r8 = java.lang.Long.TYPE
            androidx.media3.exoplayer.video.MediaCodecVideoRenderer$Builder r9 = new androidx.media3.exoplayer.video.MediaCodecVideoRenderer$Builder
            r10 = r15
            r9.<init>(r15)
            androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$Factory r10 = r14.getCodecAdapterFactory()
            androidx.media3.exoplayer.video.MediaCodecVideoRenderer$Builder r9 = r9.setCodecAdapterFactory(r10)
            r10 = r17
            androidx.media3.exoplayer.video.MediaCodecVideoRenderer$Builder r9 = r9.setMediaCodecSelector(r10)
            r10 = r21
            androidx.media3.exoplayer.video.MediaCodecVideoRenderer$Builder r9 = r9.setAllowedJoiningTimeMs(r10)
            r12 = r18
            androidx.media3.exoplayer.video.MediaCodecVideoRenderer$Builder r9 = r9.setEnableDecoderFallback(r12)
            androidx.media3.exoplayer.video.MediaCodecVideoRenderer$Builder r9 = r9.setEventHandler(r1)
            androidx.media3.exoplayer.video.MediaCodecVideoRenderer$Builder r9 = r9.setEventListener(r2)
            r12 = 50
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            androidx.media3.exoplayer.video.MediaCodecVideoRenderer$Builder r9 = r9.setMaxDroppedFramesToNotify(r12)
            boolean r12 = r14.parseAv1SampleDependencies
            androidx.media3.exoplayer.video.MediaCodecVideoRenderer$Builder r9 = r9.experimentalSetParseAv1SampleDependencies(r12)
            long r10 = r14.lateThresholdToDropDecoderInputUs
            androidx.media3.exoplayer.video.MediaCodecVideoRenderer$Builder r9 = r9.experimentalSetLateThresholdToDropDecoderInputUs(r10)
            androidx.media3.exoplayer.video.MediaCodecVideoRenderer r9 = r9.build()
            r3.add(r9)
            if (r0 != 0) goto L5b
            goto Lfa
        L5b:
            int r9 = r3.size()
            r10 = 2
            if (r0 != r10) goto L64
            int r9 = r9 + (-1)
        L64:
            java.lang.String r0 = "androidx.media3.decoder.vp9.LibvpxVideoRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L8b java.lang.ClassNotFoundException -> L97
            java.lang.Class[] r10 = new java.lang.Class[]{r8, r7, r6, r5}     // Catch: java.lang.Exception -> L8b java.lang.ClassNotFoundException -> L97
            java.lang.reflect.Constructor r0 = r0.getConstructor(r10)     // Catch: java.lang.Exception -> L8b java.lang.ClassNotFoundException -> L97
            java.lang.Long r10 = java.lang.Long.valueOf(r21)     // Catch: java.lang.Exception -> L8b java.lang.ClassNotFoundException -> L97
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r1, r2, r13}     // Catch: java.lang.Exception -> L8b java.lang.ClassNotFoundException -> L97
            java.lang.Object r0 = r0.newInstance(r10)     // Catch: java.lang.Exception -> L8b java.lang.ClassNotFoundException -> L97
            androidx.media3.exoplayer.Renderer r0 = (androidx.media3.exoplayer.Renderer) r0     // Catch: java.lang.Exception -> L8b java.lang.ClassNotFoundException -> L97
            int r10 = r9 + 1
            r3.add(r9, r0)     // Catch: java.lang.Exception -> L8b java.lang.ClassNotFoundException -> L8d
            java.lang.String r0 = "Loaded LibvpxVideoRenderer."
            androidx.media3.common.util.Log.i(r4, r0)     // Catch: java.lang.Exception -> L8b java.lang.ClassNotFoundException -> L8d
            goto L98
        L8b:
            r0 = move-exception
            goto L8f
        L8d:
            r9 = r10
            goto L97
        L8f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Error instantiating VP9 extension"
            r1.<init>(r2, r0)
            throw r1
        L97:
            r10 = r9
        L98:
            java.lang.String r0 = "androidx.media3.decoder.av1.Libgav1VideoRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> Lbf java.lang.ClassNotFoundException -> Lcb
            java.lang.Class[] r9 = new java.lang.Class[]{r8, r7, r6, r5}     // Catch: java.lang.Exception -> Lbf java.lang.ClassNotFoundException -> Lcb
            java.lang.reflect.Constructor r0 = r0.getConstructor(r9)     // Catch: java.lang.Exception -> Lbf java.lang.ClassNotFoundException -> Lcb
            java.lang.Long r9 = java.lang.Long.valueOf(r21)     // Catch: java.lang.Exception -> Lbf java.lang.ClassNotFoundException -> Lcb
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r1, r2, r13}     // Catch: java.lang.Exception -> Lbf java.lang.ClassNotFoundException -> Lcb
            java.lang.Object r0 = r0.newInstance(r9)     // Catch: java.lang.Exception -> Lbf java.lang.ClassNotFoundException -> Lcb
            androidx.media3.exoplayer.Renderer r0 = (androidx.media3.exoplayer.Renderer) r0     // Catch: java.lang.Exception -> Lbf java.lang.ClassNotFoundException -> Lcb
            int r9 = r10 + 1
            r3.add(r10, r0)     // Catch: java.lang.Exception -> Lbf java.lang.ClassNotFoundException -> Lc1
            java.lang.String r0 = "Loaded Libgav1VideoRenderer."
            androidx.media3.common.util.Log.i(r4, r0)     // Catch: java.lang.Exception -> Lbf java.lang.ClassNotFoundException -> Lc1
            goto Lcc
        Lbf:
            r0 = move-exception
            goto Lc3
        Lc1:
            r10 = r9
            goto Lcb
        Lc3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Error instantiating AV1 extension"
            r1.<init>(r2, r0)
            throw r1
        Lcb:
            r9 = r10
        Lcc:
            java.lang.String r0 = "androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> Lf1 java.lang.ClassNotFoundException -> Lfa
            java.lang.Class[] r5 = new java.lang.Class[]{r8, r7, r6, r5}     // Catch: java.lang.Exception -> Lf1 java.lang.ClassNotFoundException -> Lfa
            java.lang.reflect.Constructor r0 = r0.getConstructor(r5)     // Catch: java.lang.Exception -> Lf1 java.lang.ClassNotFoundException -> Lfa
            java.lang.Long r5 = java.lang.Long.valueOf(r21)     // Catch: java.lang.Exception -> Lf1 java.lang.ClassNotFoundException -> Lfa
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r1, r2, r13}     // Catch: java.lang.Exception -> Lf1 java.lang.ClassNotFoundException -> Lfa
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> Lf1 java.lang.ClassNotFoundException -> Lfa
            androidx.media3.exoplayer.Renderer r0 = (androidx.media3.exoplayer.Renderer) r0     // Catch: java.lang.Exception -> Lf1 java.lang.ClassNotFoundException -> Lfa
            r3.add(r9, r0)     // Catch: java.lang.Exception -> Lf1 java.lang.ClassNotFoundException -> Lfa
            java.lang.String r0 = "Loaded FfmpegVideoRenderer."
            androidx.media3.common.util.Log.i(r4, r0)     // Catch: java.lang.Exception -> Lf1 java.lang.ClassNotFoundException -> Lfa
            goto Lfa
        Lf1:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        Lfa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.DefaultRenderersFactory.buildVideoRenderers(android.content.Context, int, androidx.media3.exoplayer.mediacodec.MediaCodecSelector, boolean, android.os.Handler, androidx.media3.exoplayer.video.VideoRendererEventListener, long, java.util.ArrayList):void");
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
        Handler handler2;
        ArrayList<Renderer> arrayList = new ArrayList<>();
        buildVideoRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, handler, videoRendererEventListener, this.allowedVideoJoiningTimeMs, arrayList);
        AudioSink buildAudioSink = buildAudioSink(this.context, this.enableFloatOutput, this.enableAudioTrackPlaybackParams);
        if (buildAudioSink != null) {
            handler2 = handler;
            buildAudioRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, buildAudioSink, handler2, audioRendererEventListener, arrayList);
        } else {
            handler2 = handler;
        }
        buildTextRenderers(this.context, textOutput, handler2.getLooper(), this.extensionRendererMode, arrayList);
        buildMetadataRenderers(this.context, metadataOutput, handler2.getLooper(), this.extensionRendererMode, arrayList);
        buildCameraMotionRenderers(this.context, this.extensionRendererMode, arrayList);
        buildImageRenderers(arrayList);
        buildMiscellaneousRenderers(this.context, handler2, this.extensionRendererMode, arrayList);
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    @Nullable
    public Renderer createSecondaryRenderer(Renderer renderer, Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
        if (renderer.getTrackType() == 2) {
            return buildSecondaryVideoRenderer(renderer, this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, handler, videoRendererEventListener, this.allowedVideoJoiningTimeMs);
        }
        return null;
    }

    @uo.a
    public final DefaultRenderersFactory experimentalSetEnableMediaCodecVideoRendererPrewarming(boolean z11) {
        this.enableMediaCodecVideoRendererPrewarming = z11;
        return this;
    }

    @uo.a
    public final DefaultRenderersFactory experimentalSetLateThresholdToDropDecoderInputUs(long j11) {
        this.lateThresholdToDropDecoderInputUs = j11;
        return this;
    }

    @uo.a
    public final DefaultRenderersFactory experimentalSetMediaCodecAsyncCryptoFlagEnabled(boolean z11) {
        this.codecAdapterFactory.experimentalSetAsyncCryptoFlagEnabled(z11);
        return this;
    }

    @uo.a
    public final DefaultRenderersFactory experimentalSetParseAv1SampleDependencies(boolean z11) {
        this.parseAv1SampleDependencies = z11;
        return this;
    }

    @uo.a
    public final DefaultRenderersFactory forceDisableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceDisableAsynchronous();
        return this;
    }

    @uo.a
    public final DefaultRenderersFactory forceEnableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceEnableAsynchronous();
        return this;
    }

    public MediaCodecAdapter.Factory getCodecAdapterFactory() {
        return this.codecAdapterFactory;
    }

    public ImageDecoder.Factory getImageDecoderFactory() {
        return ImageDecoder.Factory.DEFAULT;
    }

    @uo.a
    public final DefaultRenderersFactory setAllowedVideoJoiningTimeMs(long j11) {
        this.allowedVideoJoiningTimeMs = j11;
        return this;
    }

    @uo.a
    public final DefaultRenderersFactory setEnableAudioFloatOutput(boolean z11) {
        this.enableFloatOutput = z11;
        return this;
    }

    @uo.a
    public final DefaultRenderersFactory setEnableAudioTrackPlaybackParams(boolean z11) {
        this.enableAudioTrackPlaybackParams = z11;
        return this;
    }

    @uo.a
    public final DefaultRenderersFactory setEnableDecoderFallback(boolean z11) {
        this.enableDecoderFallback = z11;
        return this;
    }

    @uo.a
    public final DefaultRenderersFactory setExtensionRendererMode(int i11) {
        this.extensionRendererMode = i11;
        return this;
    }

    @uo.a
    public final DefaultRenderersFactory setMediaCodecSelector(MediaCodecSelector mediaCodecSelector) {
        this.mediaCodecSelector = mediaCodecSelector;
        return this;
    }

    public void buildMiscellaneousRenderers(Context context, Handler handler, int i11, ArrayList<Renderer> arrayList) {
    }
}
