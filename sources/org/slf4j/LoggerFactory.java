package org.slf4j;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.NOP_FallbackServiceProvider;
import org.slf4j.helpers.Reporter;
import org.slf4j.helpers.SubstituteLogger;
import org.slf4j.helpers.SubstituteServiceProvider;
import org.slf4j.helpers.Util;
import org.slf4j.spi.SLF4JServiceProvider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class LoggerFactory {
    static final String CODES_PREFIX = "https://www.slf4j.org/codes.html";
    static final String CONNECTED_WITH_MSG = "Connected with provider of type [";
    static final int FAILED_INITIALIZATION = 2;
    static final String IGNORED_BINDINGS_URL = "https://www.slf4j.org/codes.html#ignoredBindings";
    static volatile int INITIALIZATION_STATE = 0;
    static final String JAVA_VENDOR_PROPERTY = "java.vendor.url";
    static final String LOGGER_NAME_MISMATCH_URL = "https://www.slf4j.org/codes.html#loggerNameMismatch";
    static final String MULTIPLE_BINDINGS_URL = "https://www.slf4j.org/codes.html#multiple_bindings";
    static final int NOP_FALLBACK_INITIALIZATION = 4;
    static final String NO_PROVIDERS_URL = "https://www.slf4j.org/codes.html#noProviders";
    static final int ONGOING_INITIALIZATION = 1;
    static volatile SLF4JServiceProvider PROVIDER = null;
    public static final String PROVIDER_PROPERTY_KEY = "slf4j.provider";
    static final String REPLAY_URL = "https://www.slf4j.org/codes.html#replay";
    private static final String STATIC_LOGGER_BINDER_PATH = "org/slf4j/impl/StaticLoggerBinder.class";
    static final String SUBSTITUTE_LOGGER_URL = "https://www.slf4j.org/codes.html#substituteLogger";
    static final int SUCCESSFUL_INITIALIZATION = 3;
    static final int UNINITIALIZED = 0;
    static final String UNSUCCESSFUL_INIT_MSG = "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit";
    static final String UNSUCCESSFUL_INIT_URL = "https://www.slf4j.org/codes.html#unsuccessfulInit";
    static final String VERSION_MISMATCH = "https://www.slf4j.org/codes.html#version_mismatch";
    static final SubstituteServiceProvider SUBST_PROVIDER = new SubstituteServiceProvider();
    static final NOP_FallbackServiceProvider NOP_FALLBACK_SERVICE_PROVIDER = new NOP_FallbackServiceProvider();
    static final String DETECT_LOGGER_NAME_MISMATCH_PROPERTY = "slf4j.detectLoggerNameMismatch";
    static boolean DETECT_LOGGER_NAME_MISMATCH = Util.safeGetBooleanSystemProperty(DETECT_LOGGER_NAME_MISMATCH_PROPERTY);
    private static final String[] API_COMPATIBILITY_LIST = {"2.0"};

    private LoggerFactory() {
    }

    private static final void bind() {
        try {
            List<SLF4JServiceProvider> findServiceProviders = findServiceProviders();
            reportMultipleBindingAmbiguity(findServiceProviders);
            if (findServiceProviders == null || findServiceProviders.isEmpty()) {
                INITIALIZATION_STATE = 4;
                Reporter.warn("No SLF4J providers were found.");
                Reporter.warn("Defaulting to no-operation (NOP) logger implementation");
                Reporter.warn("See https://www.slf4j.org/codes.html#noProviders for further details.");
                reportIgnoredStaticLoggerBinders(findPossibleStaticLoggerBinderPathSet());
            } else {
                PROVIDER = findServiceProviders.get(0);
                PROVIDER.initialize();
                INITIALIZATION_STATE = 3;
                reportActualBinding(findServiceProviders);
            }
            postBindCleanUp();
        } catch (Exception e11) {
            failedBinding(e11);
            throw new IllegalStateException("Unexpected initialization failure", e11);
        }
    }

    private static void emitReplayOrSubstituionWarning(SubstituteLoggingEvent substituteLoggingEvent, int i11) {
        if (substituteLoggingEvent.getLogger().isDelegateEventAware()) {
            emitReplayWarning(i11);
        } else {
            if (substituteLoggingEvent.getLogger().isDelegateNOP()) {
                return;
            }
            emitSubstitutionWarning();
        }
    }

    private static void emitReplayWarning(int i11) {
        Reporter.warn("A number (" + i11 + ") of logging calls during the initialization phase have been intercepted and are");
        Reporter.warn("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        Reporter.warn("See also https://www.slf4j.org/codes.html#replay");
    }

    private static void emitSubstitutionWarning() {
        Reporter.warn("The following set of substitute loggers may have been accessed");
        Reporter.warn("during the initialization phase. Logging calls during this");
        Reporter.warn("phase were not honored. However, subsequent logging calls to these");
        Reporter.warn("loggers will work as normally expected.");
        Reporter.warn("See also https://www.slf4j.org/codes.html#substituteLogger");
    }

    public static void failedBinding(Throwable th2) {
        INITIALIZATION_STATE = 2;
        Reporter.error("Failed to instantiate SLF4J LoggerFactory", th2);
    }

    public static Set<URL> findPossibleStaticLoggerBinderPathSet() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = LoggerFactory.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(STATIC_LOGGER_BINDER_PATH) : classLoader.getResources(STATIC_LOGGER_BINDER_PATH);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
            return linkedHashSet;
        } catch (IOException e11) {
            Reporter.error("Error getting resources from path", e11);
            return linkedHashSet;
        }
    }

    public static List<SLF4JServiceProvider> findServiceProviders() {
        ArrayList arrayList = new ArrayList();
        ClassLoader classLoader = LoggerFactory.class.getClassLoader();
        SLF4JServiceProvider loadExplicitlySpecified = loadExplicitlySpecified(classLoader);
        if (loadExplicitlySpecified != null) {
            arrayList.add(loadExplicitlySpecified);
            return arrayList;
        }
        Iterator<SLF4JServiceProvider> it = getServiceLoader(classLoader).iterator();
        while (it.hasNext()) {
            safelyInstantiate(arrayList, it);
        }
        return arrayList;
    }

    private static void fixSubstituteLoggers() {
        SubstituteServiceProvider substituteServiceProvider = SUBST_PROVIDER;
        synchronized (substituteServiceProvider) {
            try {
                substituteServiceProvider.getSubstituteLoggerFactory().postInitialization();
                for (SubstituteLogger substituteLogger : substituteServiceProvider.getSubstituteLoggerFactory().getLoggers()) {
                    substituteLogger.setDelegate(getLogger(substituteLogger.getName()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ILoggerFactory getILoggerFactory() {
        return getProvider().getLoggerFactory();
    }

    public static Logger getLogger(String str) {
        return getILoggerFactory().getLogger(str);
    }

    public static SLF4JServiceProvider getProvider() {
        if (INITIALIZATION_STATE == 0) {
            synchronized (LoggerFactory.class) {
                try {
                    if (INITIALIZATION_STATE == 0) {
                        INITIALIZATION_STATE = 1;
                        performInitialization();
                    }
                } finally {
                }
            }
        }
        int i11 = INITIALIZATION_STATE;
        if (i11 == 1) {
            return SUBST_PROVIDER;
        }
        if (i11 == 2) {
            throw new IllegalStateException(UNSUCCESSFUL_INIT_MSG);
        }
        if (i11 == 3) {
            return PROVIDER;
        }
        if (i11 == 4) {
            return NOP_FALLBACK_SERVICE_PROVIDER;
        }
        throw new IllegalStateException("Unreachable code");
    }

    private static ServiceLoader<SLF4JServiceProvider> getServiceLoader(final ClassLoader classLoader) {
        return System.getSecurityManager() == null ? ServiceLoader.load(SLF4JServiceProvider.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.slf4j.a
            @Override // java.security.PrivilegedAction
            public final Object run() {
                ServiceLoader load;
                load = ServiceLoader.load(SLF4JServiceProvider.class, classLoader);
                return load;
            }
        });
    }

    private static boolean isAmbiguousProviderList(List<SLF4JServiceProvider> list) {
        return list.size() > 1;
    }

    public static SLF4JServiceProvider loadExplicitlySpecified(ClassLoader classLoader) {
        String property = System.getProperty(PROVIDER_PROPERTY_KEY);
        if (property != null && !property.isEmpty()) {
            try {
                Reporter.info(String.format("Attempting to load provider \"%s\" specified via \"%s\" system property", property, PROVIDER_PROPERTY_KEY));
                return (SLF4JServiceProvider) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e11) {
                Reporter.error(String.format("Specified SLF4JServiceProvider (%s) does not implement SLF4JServiceProvider interface", property), e11);
                return null;
            } catch (ClassNotFoundException e12) {
                e = e12;
                Reporter.error(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (IllegalAccessException e13) {
                e = e13;
                Reporter.error(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (InstantiationException e14) {
                e = e14;
                Reporter.error(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (NoSuchMethodException e15) {
                e = e15;
                Reporter.error(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (InvocationTargetException e16) {
                e = e16;
                Reporter.error(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            }
        }
        return null;
    }

    private static boolean nonMatchingClasses(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    private static final void performInitialization() {
        bind();
        if (INITIALIZATION_STATE == 3) {
            versionSanityCheck();
        }
    }

    private static void postBindCleanUp() {
        fixSubstituteLoggers();
        replayEvents();
        SUBST_PROVIDER.getSubstituteLoggerFactory().clear();
    }

    private static void replayEvents() {
        LinkedBlockingQueue<SubstituteLoggingEvent> eventQueue = SUBST_PROVIDER.getSubstituteLoggerFactory().getEventQueue();
        int size = eventQueue.size();
        ArrayList<SubstituteLoggingEvent> arrayList = new ArrayList(128);
        int i11 = 0;
        while (eventQueue.drainTo(arrayList, 128) != 0) {
            for (SubstituteLoggingEvent substituteLoggingEvent : arrayList) {
                replaySingleEvent(substituteLoggingEvent);
                int i12 = i11 + 1;
                if (i11 == 0) {
                    emitReplayOrSubstituionWarning(substituteLoggingEvent, size);
                }
                i11 = i12;
            }
            arrayList.clear();
        }
    }

    private static void replaySingleEvent(SubstituteLoggingEvent substituteLoggingEvent) {
        if (substituteLoggingEvent == null) {
            return;
        }
        SubstituteLogger logger = substituteLoggingEvent.getLogger();
        String name = logger.getName();
        if (logger.isDelegateNull()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (logger.isDelegateNOP()) {
            return;
        }
        if (!logger.isDelegateEventAware()) {
            Reporter.warn(name);
        } else if (logger.isEnabledForLevel(substituteLoggingEvent.getLevel())) {
            logger.log(substituteLoggingEvent);
        }
    }

    private static void reportActualBinding(List<SLF4JServiceProvider> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (isAmbiguousProviderList(list)) {
            Reporter.info("Actual provider is of type [" + list.get(0) + "]");
            return;
        }
        Reporter.debug(CONNECTED_WITH_MSG + list.get(0).getClass().getName() + "]");
    }

    private static void reportIgnoredStaticLoggerBinders(Set<URL> set) {
        if (set.isEmpty()) {
            return;
        }
        Reporter.warn("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator<URL> it = set.iterator();
        while (it.hasNext()) {
            Reporter.warn("Ignoring binding found at [" + it.next() + "]");
        }
        Reporter.warn("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    private static void reportMultipleBindingAmbiguity(List<SLF4JServiceProvider> list) {
        if (isAmbiguousProviderList(list)) {
            Reporter.warn("Class path contains multiple SLF4J providers.");
            Iterator<SLF4JServiceProvider> it = list.iterator();
            while (it.hasNext()) {
                Reporter.warn("Found provider [" + it.next() + "]");
            }
            Reporter.warn("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static void reset() {
        INITIALIZATION_STATE = 0;
    }

    private static void safelyInstantiate(List<SLF4JServiceProvider> list, Iterator<SLF4JServiceProvider> it) {
        try {
            list.add(it.next());
        } catch (ServiceConfigurationError e11) {
            Reporter.error("A service provider failed to instantiate:\n" + e11.getMessage());
        }
    }

    private static final void versionSanityCheck() {
        try {
            String requestedApiVersion = PROVIDER.getRequestedApiVersion();
            boolean z11 = false;
            for (String str : API_COMPATIBILITY_LIST) {
                if (requestedApiVersion.startsWith(str)) {
                    z11 = true;
                }
            }
            if (z11) {
                return;
            }
            Reporter.warn("The requested version " + requestedApiVersion + " by your slf4j provider is not compatible with " + Arrays.asList(API_COMPATIBILITY_LIST).toString());
            Reporter.warn("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (Throwable th2) {
            Reporter.error("Unexpected problem occurred during version sanity check", th2);
        }
    }

    public static Logger getLogger(Class<?> cls) {
        Class<?> callingClass;
        Logger logger = getLogger(cls.getName());
        if (DETECT_LOGGER_NAME_MISMATCH && (callingClass = Util.getCallingClass()) != null && nonMatchingClasses(cls, callingClass)) {
            Reporter.warn(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", logger.getName(), callingClass.getName()));
            Reporter.warn("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return logger;
    }
}
