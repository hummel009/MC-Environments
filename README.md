This repository contains my personal Gradle templates for modding on various versions of Minecraft.

## What was changed

* All non-working ForgeGradle templates for ancient versions of Minecraft have been replaced with modern working analogs.
  * Voldeloom have been used for 1.3.2 - 1.6.4.
  * RetroFuturaGradle have been used for 1.7.10.
  * Essential Loom have been used for 1.8.9 - 1.12.2.
* All templates use Gradle 8, so they can work on Java 8, 11, 17, 21 and, probably, future versions too. In short, this technology stack will be relevant for a long time.
* Kotlin DSL is used, because it is really convenient and modern.
* All rarely required plugins and tasks have been cut.
* The number of plugins has been reduced to a minimum: unnecessary ones have been cut out, and necessary ones have been unified (the same version of the plugin, although in the original they evolved over the years and changed version numbers).
* All templates for Fabric use Mojang Mappings. For unification, again. If you are writing a mod for several loaders, you will be more accustomed to it.
