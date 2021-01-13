INSERT INTO brand (brand_id, brand_name, brand_fipe_id)
VALUES ('ca43ec74-5bb0-4288-ab11-5df094ca4dc4', 'FIAT', 21);

INSERT INTO brand (brand_id, brand_name, brand_fipe_id)
VALUES ('c0225595-e293-477b-8758-384872470f00', 'FORD', 22);

INSERT INTO brand (brand_id, brand_name, brand_fipe_id)
VALUES ('e66e8451-a442-4344-bbd9-17f249d9eea4', 'CHEVROLET', 23);

INSERT INTO vehicle_model (vehicle_model_id, vehicle_model_name, vehicle_model_fipe_id, brand_fk)
VALUES ('5bc16064-d3ee-4aed-a264-a914233d0c4f', '147 C/ CL', '437', 'ca43ec74-5bb0-4288-ab11-5df094ca4dc4');

INSERT INTO vehicle_model (vehicle_model_id, vehicle_model_name, vehicle_model_fipe_id, brand_fk)
VALUES ('e16e9ed4-43c6-4882-9f2f-12ca5aad6e7e', 'ARGO 1.0 6V Flex.', '8315', 'ca43ec74-5bb0-4288-ab11-5df094ca4dc4');

INSERT INTO vehicle_model (vehicle_model_id, vehicle_model_name, vehicle_model_fipe_id, brand_fk)
VALUES ('6533c337-f745-437c-8adf-a20895275cbf', 'Doblo ESSENCE 1.8 Flex 16V 5p', '5536', 'ca43ec74-5bb0-4288-ab11-5df094ca4dc4');

INSERT INTO vehicle_model (vehicle_model_id, vehicle_model_name, vehicle_model_fipe_id, brand_fk)
VALUES ('c08f77df-c6e0-4e73-a378-42bb83361266', 'Belina GL 1.8 / 1.6', '657', 'c0225595-e293-477b-8758-384872470f00');

INSERT INTO vehicle_model (vehicle_model_id, vehicle_model_name, vehicle_model_fipe_id, brand_fk)
VALUES ('deaf80e7-600c-4a35-af52-1fc7f1e967a8', 'EcoSport XL 1.6/ 1.6 Flex 8V 5p', '680', 'c0225595-e293-477b-8758-384872470f00');

INSERT INTO vehicle_model (vehicle_model_id, vehicle_model_name, vehicle_model_fipe_id, brand_fk)
VALUES ('b1c9a613-29ee-4171-a5ff-e7d98a0fdaac', 'Fiesta SEL Style 1.6 16V Flex Mec. 5p', '7754', 'c0225595-e293-477b-8758-384872470f00');

INSERT INTO vehicle_model (vehicle_model_id, vehicle_model_name, vehicle_model_fipe_id, brand_fk)
VALUES ('828bd4bf-ea80-4449-bf8f-154cda91d864', 'Astra Eleg. 2.0 MPFI FlexPower 8V 5p Aut', '940', 'e66e8451-a442-4344-bbd9-17f249d9eea4');

INSERT INTO vehicle_model (vehicle_model_id, vehicle_model_name, vehicle_model_fipe_id, brand_fk)
VALUES ('cc0b4033-9624-400d-b45d-84cceb7e0441', 'Celta Life 1.0 MPFI VHC 8V 3p', '997', 'e66e8451-a442-4344-bbd9-17f249d9eea4');

INSERT INTO vehicle_model (vehicle_model_id, vehicle_model_name, vehicle_model_fipe_id, brand_fk)
VALUES ('7a9e2990-b356-40e6-b0b5-c26d38e3f5bb', 'Meriva Joy 1.8 MPFI 8V FlexPower', '1093', 'e66e8451-a442-4344-bbd9-17f249d9eea4');
