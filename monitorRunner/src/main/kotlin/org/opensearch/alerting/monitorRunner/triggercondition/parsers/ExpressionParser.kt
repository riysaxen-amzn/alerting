/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.alerting.monitorRunner.triggercondition.parsers

import org.opensearch.alerting.monitorRunner.triggercondition.resolvers.TriggerExpressionResolver

interface ExpressionParser {
    fun parse(): TriggerExpressionResolver
}
