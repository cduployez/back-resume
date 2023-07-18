{{/*
Expand the name of the chart.
*/}}
{{- define "helm-chart.back-resume.name" -}}
{{- default .Chart.Name .Values.backResume.nameOverride | trunc 63 | trimSuffix "-" }}
{{- end }}

{{/*
Create a default fully qualified app name.
We truncate at 63 chars because some Kubernetes name fields are limited to this (by the DNS naming spec).
If release name contains chart name it will be used as a full name.
*/}}
{{- define "helm-chart.back-resume.fullname" -}}
{{- if .Values.backResume.fullnameOverride }}
{{- .Values.backResume.fullnameOverride | trunc 63 | trimSuffix "-" }}
{{- else }}
{{- $name := default .Chart.Name .Values.backResume.nameOverride }}
{{- if contains $name .Release.Name }}
{{- .Release.Name | trunc 63 | trimSuffix "-" }}
{{- else }}
{{- printf "%s-%s" .Release.Name $name | trunc 63 | trimSuffix "-" }}
{{- end }}
{{- end }}
{{- end }}

{{/*
Create chart name and version as used by the chart label.
*/}}
{{- define "helm-chart.chart" -}}
{{- printf "%s-%s" .Chart.Name .Chart.Version | replace "+" "_" | trunc 63 | trimSuffix "-" }}
{{- end }}

{{/*
Common labels
*/}}
{{- define "helm-chart.back-resume.labels" -}}
helm.sh/chart: {{ include "helm-chart.chart" . }}
{{ include "helm-chart.back-resume.selectorLabels" . }}
{{- if .Chart.AppVersion }}
app.kubernetes.io/version: {{ .Chart.AppVersion | quote }}
{{- end }}
app.kubernetes.io/managed-by: {{ .Release.Service }}
{{- end }}

{{/*
Selector labels
*/}}
{{- define "helm-chart.back-resume.selectorLabels" -}}
app.kubernetes.io/name: {{ include "helm-chart.back-resume.name" . }}
app.kubernetes.io/instance: {{ .Release.Name }}
{{- end }}
