/*
 * Fwd: the port forwarding app
 * Copyright (C) 2016  Elixsr Ltd
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.elixsr.portforwarder.util

/**
 * The [NetworkHelper] class provides static objects and methods related to network metadata.
 *
 * @author Niall McShane
 */
object NetworkHelper {
    /**
     * A String denoting TCP.
     */
    const val TCP = "TCP"

    /**
     * A String denoting UDP.
     */
    const val UDP = "UDP"

    /**
     * A String denoting BOTH.
     */
    const val BOTH = "BOTH"

    /**
     * Return whether or not an IPv4 Address is valid.
     *
     * @param address The IPv4 Address
     * @return true if valid, false if not valid.
     */
    @Deprecated("")
    fun isValidIpv4Address(address: String?): Boolean {
        return !address.isNullOrEmpty()
    }
}