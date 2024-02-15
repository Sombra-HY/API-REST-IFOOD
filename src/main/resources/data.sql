INSERT INTO RESTAURANT (ID, CEP, COMPLEMENT, NAME) VALUES
            (1,'Restaurant 1','05570000','sla'),
            (2,'Restaurant 2','05450000','2sla'),
            (3,'Restaurant 3','05325000','3sla');

INSERT INTO CLIENT (ID, CEP, COMPLEMENT, NAME) VALUES
            (1,'Lerry','05325000','sla');

INSERT INTO PRODUCT (ID, is_Available, name, uni_Value, restaurant_id) VALUES
            (1,true, 'produto 1', 5.8, 1),
            (2,true, 'produto 2', 65.8, 2),
            (3,true, 'produto 3', 15.8, 3);
INSERT INTO market_BAG (id, i_Payment_Method, isbag_Close, price_Total, client_id) VALUES
    (1,0,false,0.0,1);
