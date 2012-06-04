/*
 * Copyright (C) 2009 Jayway AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.photon.maven.plugins.android.standalonemojos;

import com.photon.maven.plugins.android.AbstractEmulatorMojo;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * EmulatorStopeAllMojo will stop all attached devices.
 *
 * @goal emulator-stop-all
 * @requiresProject false
 */
public class EmulatorStopAllMojo extends AbstractEmulatorMojo {

    /**
     * Start the Android Emulator.
     *
     * @throws org.apache.maven.plugin.MojoExecutionException
     *
     * @throws org.apache.maven.plugin.MojoFailureException
     *
     */
    public void execute() throws MojoExecutionException, MojoFailureException {
        stopAndroidEmulators();
    }
}
