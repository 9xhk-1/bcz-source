package com.tencent.liteav.audio;

import android.text.TextUtils;
import com.squareup.picasso.h0;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.h;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXCSoundEffectPlayer implements TXAudioEffectManager.TXMusicPlayObserver {
    private static final String TAG = "AudioCenter:TXCSoundEffectPlayer";
    private static WeakReference<com.tencent.liteav.audio.a> mWeakSoundEffectListener;
    private List<Integer> mShortEffectorIDList = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final TXCSoundEffectPlayer f42934a = new TXCSoundEffectPlayer();
    }

    static {
        h.d();
    }

    private String checkIfAssetsFile(String str) {
        long j11;
        if (!TextUtils.isEmpty(str) && TXCCommonUtil.getAppContext() != null) {
            if (!str.startsWith("/assets/")) {
                return str;
            }
            String substring = str.substring(8);
            try {
                try {
                    j11 = TXCCommonUtil.getAppContext().getAssets().openFd(substring).getLength();
                } catch (Exception e11) {
                    TXCLog.e(TAG, "playAudioEffect openFd error " + e11.toString());
                    j11 = 0;
                }
                String effectCachePath = getEffectCachePath();
                File file = new File(effectCachePath);
                if (!file.exists()) {
                    file.mkdirs();
                } else if (file.isFile()) {
                    file.delete();
                    file.mkdirs();
                }
                int lastIndexOf = substring.lastIndexOf(File.separatorChar);
                if (lastIndexOf != -1) {
                    str = effectCachePath + File.separator + j11 + "_" + substring.substring(lastIndexOf + 1);
                } else {
                    str = effectCachePath + File.separator + j11 + "_" + substring;
                }
                if (!com.tencent.liteav.basic.util.c.a(str)) {
                    com.tencent.liteav.basic.util.c.a(TXCCommonUtil.getAppContext(), substring, str);
                }
            } catch (Exception e12) {
                TXCLog.e(TAG, "playAudioEffect error " + e12.toString());
            }
        }
        return str;
    }

    private String getEffectCachePath() {
        if (TXCCommonUtil.getAppContext() == null) {
            return "";
        }
        return TXCCommonUtil.getAppContext().getCacheDir() + File.separator + "liteav_effect";
    }

    public static TXCSoundEffectPlayer getInstance() {
        return a.f42934a;
    }

    public void clearCache() {
        if (TXCCommonUtil.getAppContext() == null) {
            return;
        }
        try {
            File file = new File(getEffectCachePath());
            if (file.exists() && file.isDirectory() && com.tencent.liteav.basic.util.c.a(file) > h0.f41864f) {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        } catch (Exception e11) {
            TXCLog.w(TAG, "clearCache error " + e11.toString());
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i11, int i12) {
        TXCLog.i(TAG, "onMusicPlayFinish -> effect id = " + i11);
        WeakReference<com.tencent.liteav.audio.a> weakReference = mWeakSoundEffectListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mWeakSoundEffectListener.get().a(i11);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i11, int i12) {
        TXCLog.i(TAG, "onStart -> effect id = " + i11 + ", errCode = " + i12);
        WeakReference<com.tencent.liteav.audio.a> weakReference = mWeakSoundEffectListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mWeakSoundEffectListener.get().a(i11, i12);
    }

    public void pauseEffectWithId(int i11) {
        TXCLog.i(TAG, "pauseEffectWithId -> effect id = " + i11);
        TXAudioEffectManagerImpl.getCacheInstance().pausePlayMusic(i11);
    }

    public boolean playEffectWithId(int i11, String str, boolean z11, int i12) {
        TXCLog.i(TAG, "playEffectWithId -> effect id = " + i11 + ", path = " + str + ", loop = " + i12);
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(i11, checkIfAssetsFile(str));
        audioMusicParam.publish = z11;
        audioMusicParam.loopCount = i12;
        audioMusicParam.isShortFile = true;
        boolean startPlayMusic = TXAudioEffectManagerImpl.getCacheInstance().startPlayMusic(audioMusicParam);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicObserver(i11, this);
        this.mShortEffectorIDList.add(Integer.valueOf(i11));
        TXCLog.i(TAG, "playEffectWithId ->effect id = " + i11 + ", startPlayMusic result = " + startPlayMusic);
        return startPlayMusic;
    }

    public void resumeEffectWithId(int i11) {
        TXCLog.i(TAG, "resumeEffectWithId -> effect id = " + i11);
        TXAudioEffectManagerImpl.getCacheInstance().resumePlayMusic(i11);
    }

    public void setEffectsVolume(float f11) {
        TXCLog.i(TAG, "setEffectsVolume -> volume = " + f11);
        Iterator<Integer> it = this.mShortEffectorIDList.iterator();
        while (it.hasNext()) {
            TXAudioEffectManagerImpl.getCacheInstance().setMusicVolume(it.next().intValue(), (int) (100.0f * f11));
        }
    }

    public void setSoundEffectListener(com.tencent.liteav.audio.a aVar) {
        if (aVar == null) {
            mWeakSoundEffectListener = null;
        } else {
            mWeakSoundEffectListener = new WeakReference<>(aVar);
        }
    }

    public void setVolumeOfEffect(int i11, float f11) {
        TXCLog.i(TAG, "setVolumeOfEffect -> effect id = " + i11 + ", volume = " + f11);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicVolume(i11, (int) (f11 * 100.0f));
    }

    public void stopAllEffect() {
        TXCLog.i(TAG, "stopAllEffect -> start");
        Iterator<Integer> it = this.mShortEffectorIDList.iterator();
        while (it.hasNext()) {
            TXAudioEffectManagerImpl.getCacheInstance().stopPlayMusic(it.next().intValue());
        }
        this.mShortEffectorIDList.clear();
        TXCLog.i(TAG, "stopAllEffect -> finish");
    }

    public void stopEffectWithId(int i11) {
        TXCLog.i(TAG, "stopEffectWithId -> effect id = " + i11);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicObserver(i11, null);
        TXAudioEffectManagerImpl.getCacheInstance().stopPlayMusic(i11);
        int indexOf = this.mShortEffectorIDList.indexOf(Integer.valueOf(i11));
        if (indexOf >= 0) {
            this.mShortEffectorIDList.remove(indexOf);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i11, long j11, long j12) {
    }
}
