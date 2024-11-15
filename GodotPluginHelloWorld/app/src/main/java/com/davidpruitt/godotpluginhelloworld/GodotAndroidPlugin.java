package com.davidpruitt.godotpluginhelloworld;

import android.widget.Toast;

import androidx.annotation.NonNull;

import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.UsedByGodot;

public class GodotAndroidPlugin extends GodotPlugin
{
    /**
     * Base constructor passing a {@link Godot} instance through which the plugin can access Godot's
     * APIs and lifecycle events.
     *
     * @param godot
     */
    public GodotAndroidPlugin(Godot godot)
    {
        super(godot);
    }

    @NonNull
    @Override
    public String getPluginName()
    {
        return "GodotAndroidPlugin";
    }

    @UsedByGodot
    public void MakeToast()
    {
        getGodot().getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run()
            {
                Toast.makeText(getGodot().getActivity(), "Hello, World!", Toast.LENGTH_LONG).show();
            }
        });
    }

    @UsedByGodot
    public String GetFunAndroidString ()
    {
        return "Super-cali-fragilistic";
    }
}
