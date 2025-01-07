/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.alerting.monitorRunner.chainedAlertCondition.parsers

import org.opensearch.alerting.monitorRunner.chainedAlertCondition.resolvers.ChainedAlertTriggerResolver

interface ExpressionParser {
    fun parse(): ChainedAlertTriggerResolver
}
