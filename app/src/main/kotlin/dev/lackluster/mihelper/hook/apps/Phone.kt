package dev.lackluster.mihelper.hook.apps

import com.highcapable.yukihookapi.hook.entity.YukiBaseHooker
import dev.lackluster.mihelper.hook.rules.phone.UnlockNetModeSettings

object Phone : YukiBaseHooker() {
    override fun onHook() {
        loadHooker(UnlockNetModeSettings)
    }
}