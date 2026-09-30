# Household Water Monitor Billing System

## Java Group Project

### Team Members
- D. Vishruth Goud
- B. Pavan Kumar

---

## Project Description

The Household Water Monitor Billing System is a console-based Java application
that calculates household water consumption and generates a water bill using
a progressive slab-based billing system.

The program also monitors water usage and displays a usage status based on
the amount of water consumed.

---

## Objectives

- Collect household and water-meter details.
- Calculate water consumption from previous and current meter readings.
- Validate meter readings.
- Calculate the water bill using different tariff slabs.
- Monitor and display the household's water usage status.
- Generate a clear water usage report.

---

## Features

- Household name and member input
- Previous and current meter reading input
- Automatic water consumption calculation
- Invalid meter reading detection
- Progressive slab-based billing
- Normal, Moderate, and High usage classification
- Water usage report generation

---

## Billing System

| Water Usage | Rate |
|-------------|------|
| 0 – 5,000 L | ₹0.02/L |
| 5,001 – 10,000 L | ₹0.04/L |
| Above 10,000 L | ₹0.06/L |

Each slab is calculated progressively.

---

## Usage Monitoring

The system classifies water consumption as:

- **Normal Usage:** Up to 5,000 L
- **Moderate Usage:** 5,001 – 10,000 L
- **High Usage:** Above 10,000 L

---

## Technologies Used

- Java
- Java Scanner
- Console-based application

---

## Repository Contents

```text
House-Hold-Water-Monitor-Billing/
│
├── groupproject.java
├── Water_Billing_System_Reformatted.pptx
│
├── screenshots/
│   ├── code_1.png
│   ├── code_2.png
│   ├── code_3.png
│   ├── output_success.png
│   └── output_invalid.png
│
└── README.md
