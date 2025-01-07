/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.alerting.monitorRunner.action

import org.opensearch.action.ActionType

class GetDestinationsAction private constructor() : ActionType<org.opensearch.alerting.monitorRunner.action.GetDestinationsResponse>(NAME, ::GetDestinationsResponse) {
    companion object {
        val INSTANCE = GetDestinationsAction()
        const val NAME = "cluster:admin/opendistro/alerting/destination/get"
    }
}
